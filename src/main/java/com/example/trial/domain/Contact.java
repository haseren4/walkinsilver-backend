package com.example.trial.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {
    public int getContacts_id() {
        return contacts_id;
    }

    public void setContacts_id(int contacts_id) {
        this.contacts_id = contacts_id;
    }

    @Id
    int contacts_id;

    public String getContacts_add() {
        return contacts_add;
    }

    public void setContacts_add(String contacts_add) {
        this.contacts_add = contacts_add;
    }

    String contacts_add;

    public String getContacts_title() {
        return contacts_title;
    }

    public void setContacts_title(String contacts_title) {
        this.contacts_title = contacts_title;
    }

    String contacts_title;

    public String getContacts_message() {
        return contacts_message;
    }

    public void setContacts_message(String contacts_message) {
        this.contacts_message = contacts_message;
    }

    String contacts_message;
}
