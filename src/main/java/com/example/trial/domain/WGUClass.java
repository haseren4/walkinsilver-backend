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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getComp_date() {
        return comp_date;
    }

    public void setComp_date(String comp_date) {
        this.comp_date = comp_date;
    }

    public int getCompletion() {
        return completion;
    }

    public void setCompletion(int completion) {
        this.completion = completion;
    }

    public boolean isPractical() {
        return practical;
    }

    public void setPractical(boolean practical) {
        this.practical = practical;
    }

    public boolean isObjective() {
        return objective;
    }

    public void setObjective(boolean objective) {
        this.objective = objective;
    }

    public boolean isCertification() {
        return certification;
    }

    public void setCertification(boolean certification) {
        this.certification = certification;
    }

    @Column(name = "completion")
    int completion;

    @Column(name = "practical")
    boolean practical;

    @Column(name = "objective")
    boolean objective;

    @Column(name = "certification")
    boolean certification;

}