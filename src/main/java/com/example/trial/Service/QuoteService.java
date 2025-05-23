package com.example.trial.Service;

import com.example.trial.domain.Quote;

import java.util.List;

public interface QuoteService {
    List<Quote> getAll();
    Quote getRandomEntry();
    Quote getQuoteById(int id);
}
