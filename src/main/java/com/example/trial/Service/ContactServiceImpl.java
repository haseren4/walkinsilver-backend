package com.example.trial.Service;

import com.example.trial.domain.Contact;
import com.example.trial.domain.Radio;
import com.example.trial.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    private ContactRepository contactRepository;
    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository) {this.contactRepository  = contactRepository;}

    @Override
    public List<Contact> getLast10Contacts() {
        return contactRepository.findLast10Contacts();
    }

    @Override
    public List<Contact> getAllContactsbyRadioId(Radio radio) {
        return contactRepository.findByRadioId(radio);
    }
    @Override
        public List<Contact> getContactByService(String service) {
        return contactRepository.findByService(service);
        }
}
