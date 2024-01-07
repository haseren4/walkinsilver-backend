package com.example.trial.repositories;

import com.example.trial.domain.Quote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuoteRepository extends CrudRepository<Quote, Integer> {
    @Query("SELECT q FROM Quote q WHERE q.quotes_author LIKE %?1%")
    public List<Quote> search(String keyword);
}
