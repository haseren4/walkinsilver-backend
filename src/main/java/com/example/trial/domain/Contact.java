package com.example.trial.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "callsign")
    private String callsign;

    @Column(name = "contact_Time")
    private Date contactTime;

    @Column(name = "service")
    private String service;

    @Column(name = "distance")
    private float distance;

    @ManyToOne
    @JoinColumn(name = "radio_id")
    private Radio radio;

    @Column(name = "notes")
    private String notes;

    public Contact() {}

    // Getters and setters
    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public Date getContactTime() {
        return contactTime;
    }

    public void setContactTime(Date contactTime) {
        this.contactTime = contactTime;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
