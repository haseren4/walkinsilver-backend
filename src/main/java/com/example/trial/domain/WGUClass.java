package com.example.trial.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "wgu_classes")
public class WGUClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "code")
    String code;

    @Column(name = "name")
    String name;

    @Column(name = "units")
    int units;

    @Column(name = "comp_date")
    String comp_date;

    @Column(name = "completion")
    int completion;

    @Column(name = "practical")
    boolean practical;

    @Column(name = "objective")
    boolean objective;

    @Column(name = "certification")
    boolean certification;

}