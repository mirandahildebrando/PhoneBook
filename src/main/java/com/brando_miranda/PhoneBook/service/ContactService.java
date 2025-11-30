package com.brando_miranda.PhoneBook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brando_miranda.PhoneBook.entity.Contact;
import com.brando_miranda.PhoneBook.repository.ContactRepository;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact createContact(Contact contact) {
        if(contact.getName() == null || contact.getPhone() == null) {
            throw new IllegalArgumentException("Os campos nome e telefone são obrigatórios.");
        }
        return contactRepository.save(contact);
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
