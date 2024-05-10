package com.example.trial.Service;

import com.example.trial.domain.Contact;
import com.example.trial.domain.Radio;

import java.util.List;

public interface ContactService {
    public List<Contact> getLast10Contacts();
    public List<Contact> getAllContactsbyRadioId(Radio radio);
    public List<Contact> getContactByService(String service);

}
