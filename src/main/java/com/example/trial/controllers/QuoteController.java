package com.example.trial.controllers;

import com.example.trial.Service.QuoteService;
import com.example.trial.Service.QuoteServiceImpl;
import com.example.trial.domain.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
public class QuoteController {
    public QuoteService quoteService;
    @Autowired
    public QuoteController(QuoteServiceImpl quoteService){
        this.quoteService = quoteService;
    }
    @GetMapping("api/quote/all")
    List<Quote> getAll(){return this.quoteService.getAll();}
    @GetMapping("api/quote/rand")
    Quote getRandomQuote(){return this.quoteService.getRandomEntry();}
    @GetMapping("api/quote/id={id}")
    Quote getQuoteById(@PathVariable("id")int id){return this.quoteService.getQuoteById(id);}
}
