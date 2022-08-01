package app.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String surName;
    private String email;

    public User(int id, String firstName, String surName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nИмя = " + firstName +
                "\nФамилия = " + surName +
                "\nE-mail = " + email;
    }
}
