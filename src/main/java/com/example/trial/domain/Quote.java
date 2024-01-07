package com.example.trial.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Quote {

    @Id
    private int quotes_id;
    public String getQuote() {return quotes_quote;}

    public void setQuote(String quote) {
        this.quotes_quote = quote;
    }

    String quotes_quote;

    public String getAuthor() {
        return quotes_author;
    }

    public void setAuthor(String author) {
        this.quotes_author = author;
    }

    String quotes_author;

    public void setId(int id) {
        this.quotes_id = id;
    }

    public int getId() {
        return quotes_id;
    }

}
