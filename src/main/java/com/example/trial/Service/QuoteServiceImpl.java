package com.example.trial.Service;

import com.example.trial.domain.Quote;
import com.example.trial.repositories.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuoteServiceImpl implements QuoteService{
    private QuoteRepository quoteRepository;
    @Autowired
    public QuoteServiceImpl(QuoteRepository quoteRepository){
        this.quoteRepository = quoteRepository;
    }
    @Override
    public List<Quote> findAll() {
        return (List<Quote>) quoteRepository.findAll();
    }

    @Override
    public Quote findById(int theId) {
        int theId1 = theId;
        Optional<Quote> result = quoteRepository.findById(theId1);

        Quote theQuote = null;

        if(result.isPresent()){
            theQuote = result.get();
        }
        else {
            throw new RuntimeException("Did not find quote id -" + theId);
        }
        return theQuote;
    }

    @Override
    public void save(Quote theQuote) {
        quoteRepository.save(theQuote);
    }

    @Override
    public void deleteById(int theId) {
        int theId1 = theId;
        quoteRepository.deleteById(theId1);
    }

    @Override
    public List<Quote> listAll(String keyword) {
        if(keyword != null){
            return quoteRepository.search(keyword);
        }
        return (List<Quote>) quoteRepository.findAll();
    }
}
