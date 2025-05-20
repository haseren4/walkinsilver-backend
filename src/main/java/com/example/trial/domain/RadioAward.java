package com.example.trial.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "radio-award")
public class RadioAward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @Column(name="name")
    public String name;

    @Column(name = "img_src")
    public String img_src;

    @Column(name = "type")
    public String type;

}