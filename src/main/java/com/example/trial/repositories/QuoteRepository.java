package com.example.trial.repositories;

import com.example.trial.domain.Quote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Integer> {
    @Query("SELECT q FROM Quote q")
    List<Quote> getAll();
    @Query("SELECT Q FROM Quote q WHERE q.id = :id")
    Quote getQuoteById(int id);
}
