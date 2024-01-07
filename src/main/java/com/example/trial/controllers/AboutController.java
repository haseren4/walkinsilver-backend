package com.example.trial.controllers;

import com.example.trial.Service.ContactService;
import com.example.trial.Service.QuoteService;
import com.example.trial.domain.Contact;
import com.example.trial.domain.Quote;
import com.example.trial.repositories.QuoteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AboutController {
    private QuoteService quoteService;
    private ContactService contactService;

    public AboutController(QuoteService quoteService, ContactService contactService){
        this.quoteService = quoteService;
        this.contactService = contactService;
    }

    @GetMapping("/about")
    public String about(Model theModel){
        List<Quote> quoteList= quoteService.listAll(null);
        List<Contact> contactList = contactService.listAll(null);
        theModel.addAttribute("quotes",quoteList);
        theModel.addAttribute("contacts", contactList);
        return "about";
    }
    public String toString(){
        return "about";
    }
}
