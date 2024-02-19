package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.ContactResponse;
import model.IdentifyRequest;
import service.IdentityReconciliationService;

@RestController
public class IdentityReconciliationController {
    private final IdentityReconciliationService service;

    public IdentityReconciliationController(IdentityReconciliationService service) {
        this.service = service;
    }

    @PostMapping("/identify")
    public ResponseEntity<ContactResponse> identifyContact(@RequestBody IdentifyRequest request) {
        ContactResponse response = service.identifyContact(request);
        return ResponseEntity.ok(response);
    }
}
