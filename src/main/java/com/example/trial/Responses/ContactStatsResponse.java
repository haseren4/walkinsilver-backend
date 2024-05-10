package com.example.trial.Responses;

public class ContactStatsResponse {
    private int totalContacts;
    private int totalAmateurContacts;
    public int totalGMRSContacts;

    public ContactStatsResponse(int total, int gmrs, int amateur) {
        totalContacts = total;
        totalAmateurContacts = amateur;
        totalGMRSContacts = gmrs;
    }

    public int getTotalGMRSContacts() {
        return totalGMRSContacts;
    }

    public void setTotalGMRSContacts(int totalGMRSContacts) {
        this.totalGMRSContacts = totalGMRSContacts;
    }

    public int getTotalContacts() {
        return totalContacts;
    }

    public void setTotalContacts(int totalContacts) {
        this.totalContacts = totalContacts;
    }

    public int getTotalAmateurContacts() {
        return totalAmateurContacts;
    }

    public void setTotalAmateurContacts(int totalAmateurContacts) {
        this.totalAmateurContacts = totalAmateurContacts;
    }
}
