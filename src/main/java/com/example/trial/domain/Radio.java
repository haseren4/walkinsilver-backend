package com.example.trial.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "radio")
public class Radio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "manufacturer", nullable = false)
    private String manufacturer;

    @Size(max = 255)
    @NotNull
    @Column(name = "model", nullable = false)
    private String model;

    @Size(max = 6)
    @NotNull
    @Column(name = "setup", nullable = false, length = 6)
    private String setup;

    @Size(max = 10)
    @Column(name = "bands", length = 10)
    private String bands;

    @Column(name = "max_pwr")
    private int maxPwr;
    @Lob
    @Column(name = "description")
    private String description;

    @Size(max = 255)
    @Column(name = "linkURL")
    private String linkURL;

    @Size(max = 100)
    @Column(name = "imgURL", length = 100)
    private String imgURL;

    @Transient
    @OneToMany(mappedBy = "radio")
    private List<Contact> contacts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getBands() {
        return bands;
    }

    public void setBands(String bands) {
        this.bands = bands;
    }

    public Integer getMaxPwr() {
        return maxPwr;
    }

    public void setMaxPwr(int maxPwr) {
        this.maxPwr = maxPwr;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkURL() {
        return linkURL;
    }

    public void setLinkURL(String linkURL) {
        this.linkURL = linkURL;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}