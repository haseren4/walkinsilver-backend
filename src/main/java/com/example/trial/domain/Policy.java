package com.example.trial.domain;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name="Policy")
public class Policy{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "type")
    String type;

    @Column(name = "name")
    String name;

    @Column(name = "body")
    String body;

    @Column(name= "start_date")
    String start_date;
}