package com.brando_miranda.PhoneBook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brando_miranda.DTO.ContactRequestDTO;
import com.brando_miranda.DTO.ContactResponseDTO;
import com.brando_miranda.PhoneBook.entity.Contact;
import com.brando_miranda.PhoneBook.repository.ContactRepository;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public ContactResponseDTO createContact(ContactRequestDTO dto) {

        Contact contact = new Contact();
        contact.setName(dto.name());
        contact.setPhone(dto.phone());

        Contact saved = contactRepository.save(contact);

        return new ContactResponseDTO(
            saved.getId(),
            saved.getName(),
            saved.getPhone()
        );

        
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact getContactById(Long id) {
        return contactRepository.findById(id).orElseThrow(() -> new RuntimeException("Contato não encontrado com id: " + id));
    }

    public Contact updateContact(Long id, Contact contactDetails) {
        Contact contact = contactRepository.findById(id).orElse(null);
        if (contact != null) {
            contact.setName(contactDetails.getName());
            contact.setPhone(contactDetails.getPhone());
            return contactRepository.save(contact);
        }
        return null;
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }

}
