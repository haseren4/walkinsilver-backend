package com.example.trial.Service;

import com.example.trial.domain.Quote;

import java.util.List;

public interface QuoteService {
    public List<Quote> findAll();
    public Quote findById(int theId);
    public void save(Quote theQuote);
    public void deleteById(int theId);
    public List<Quote> listAll(String keyword);
}
