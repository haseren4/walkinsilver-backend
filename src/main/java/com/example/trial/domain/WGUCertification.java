package com.example.trial.domain;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "wgu_certification")
public class WGUCertification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "title")
    String title;

    @Column(name = "weburl")
    String webURL;

    @Column(name = "imgurl")
    String imgURL;
    @Column(name = "awardDate")
    Date awardDate;
    @Column(name = "expDate")
    Date expDate;


}
