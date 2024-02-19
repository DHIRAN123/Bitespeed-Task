package service;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import model.Contact;
import model.ContactResponse;
import model.IdentifyRequest;
import repository.ContactRepository;

@Service
public class IdentityReconciliationService {
    private final ContactRepository contactRepository;

    public IdentityReconciliationService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public ContactResponse identifyContact(IdentifyRequest request) {
        Contact contact = contactRepository.findByEmailOrPhoneNumber(request.getEmail(), request.getPhoneNumber());
        if (contact == null) {
            // Create a new contact
            contact = new Contact(request.getEmail(), request.getPhoneNumber(), "primary");
            contact = contactRepository.save(contact);
            return new ContactResponse(contact.getId(), Arrays.asList(request.getEmail()), Arrays.asList(request.getPhoneNumber()), new ArrayList<>());
        } else {
            List<Contact> secondaryContacts = contactRepository.findByLinkedId(contact.getId());
            List<Long> secondaryContactIds = secondaryContacts.stream().map(Contact::getId).collect(Collectors.toList());
            secondaryContactIds.remove(contact.getId()); // Remove primary contact id from the list
            return new ContactResponse(contact.getId(), Arrays.asList(contact.getEmail()), Arrays.asList(contact.getPhoneNumber()), secondaryContactIds);
        }
    }
}
