package com.example.trial.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "quotes")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "author")
    String author;

    @Column(name = "quote")
    String quote;
}
