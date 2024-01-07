package com.example.trial.Service;

import com.example.trial.domain.Contact;
import com.example.trial.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService{

    private ContactRepository contactRepository;

    @Autowired
    public void QuoteServiceImpl(ContactRepository contactRepository){this.contactRepository = contactRepository;}
    @Override
    public List<Contact> findAll() {
        return (List<Contact>) contactRepository.findAll();
    }

    @Override
    public Contact findById(int theId) {
        int theId1 = theId;
        Optional<Contact> result = contactRepository.findById(theId1);

        Contact theContact = null;

        if(result.isPresent()){
            theContact = result.get();
        }
        else{
            throw new RuntimeException("Did not find contact id -" + theId);
        }
        return theContact;
    }

    @Override
    public void save(Contact theContact) {

    }

    @Override
    public void deleteById(int theId) {

    }

    @Override
    public List<Contact> listAll(String keyword) {
        if(keyword != null){
            return contactRepository.search(keyword);
        }
        return (List<Contact>) contactRepository.findAll();
    }
}
