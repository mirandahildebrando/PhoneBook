package com.brando_miranda.PhoneBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brando_miranda.PhoneBook.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    

}
