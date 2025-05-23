package com.example.trial.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "home_honeydo")
public class HoneyDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "title")
    String title;

    @Column(name = "message")
    String message;

    @Column(name = "completed")
    boolean completed;

}
