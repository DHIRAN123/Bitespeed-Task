package repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Contact;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    Contact findByEmailOrPhoneNumber(String email, String phoneNumber);
    List<Contact> findByLinkedId(Long linkedId);
}
