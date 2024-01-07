package com.example.trial.Service;

import com.example.trial.domain.Contact;
import com.example.trial.domain.Quote;

import java.util.List;

public interface ContactService {
    public List<Contact> findAll();
    public Contact findById(int theId);
    public void save(Contact theContact);
    public void deleteById(int theId);
    public List<Contact> listAll(String keyword);

}
