package com.example.trial.repositories;

import com.example.trial.domain.Contact;
import com.example.trial.domain.Radio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
    @Query("SELECT c FROM Contact c ORDER BY c.contactTime DESC LIMIT 10")
    public List<Contact> findLast10Contacts();
    @Query("SELECT c FROM Contact c WHERE c.radio = :radio")
    public List<Contact> findByRadioId(Radio radio);
    @Query("SELECT c FROM Contact c WHERE c.service = :service")
    public List<Contact> findByService(String service);

}
