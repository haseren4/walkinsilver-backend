package com.example.trial.Service;

import com.example.trial.domain.Quote;
import com.example.trial.repositories.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {
    private QuoteRepository quoteRepository;

    @Autowired
    public QuoteServiceImpl(QuoteRepository quoteRepository){
        this.quoteRepository = quoteRepository;
    }
    @Override
    public List<Quote> getAll() {
        return this.quoteRepository.getAll();
    }

    @Override
    public Quote getRandomEntry() {
        List<Quote> quotes =  this.quoteRepository.getAll();
        Random r = new Random();
        return quotes.get(r.nextInt(0, quotes.size()));

    }

    @Override
    public Quote getQuoteById(int id) {
        return this.quoteRepository.getQuoteById(id);
    }
}
