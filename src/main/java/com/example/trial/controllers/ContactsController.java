package com.example.trial.controllers;

import com.example.trial.Responses.ContactStatsResponse;
import com.example.trial.Service.ContactService;
import com.example.trial.Service.ContactServiceImpl;
import com.example.trial.Service.RadioService;
import com.example.trial.Service.RadioServiceImpl;
import com.example.trial.domain.Contact;
import com.example.trial.domain.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ContactsController {
    private ContactService contactService;
    private RadioService radioService;
    @Autowired
    public ContactsController(ContactServiceImpl contactService, RadioServiceImpl radioService) {
        this.contactService = contactService;
        this.radioService = radioService;
    }
    @GetMapping("api/contacts/recent")
    public List<Contact> getRecentContacts(){
        return contactService.getLast10Contacts();
    }
    @GetMapping("api/contacts/radio/{id}")
    public List<Contact> getContactsByRadioId(@PathVariable("id") int radio_id){
        Radio r = radioService.findById(radio_id);
        return contactService.getAllContactsbyRadioId(r);
    }

    @GetMapping("api/contacts/stats")
    public ContactStatsResponse getContactStats() {
        int gmrs = contactService.getContactByService("GMRS").size();
        int ham = contactService.getContactByService("HAM").size();
        return new ContactStatsResponse((gmrs + ham),gmrs,ham);
    }
}
