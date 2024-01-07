package com.example.trial.repositories;

import com.example.trial.domain.Contact;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
    @Query("SELECT c FROM Contact c WHERE c.contacts_add LIKE %?1%")
    public List<Contact> search(String keyword);
}
