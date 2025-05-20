package com.example.trial.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "radio-pic")
public class RadioPic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "imgURL")
    private String imgURL;

    @Column(name = "description")
    private String description;
}
