package com.example.jobsearch.model;

import jakarta.persistence.*;

@Entity
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Candidate extends User{

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birth_of_year")
    private int birthOfYear;
    @Column(name = "phone_number")
    private String phoneNumber;

    public Candidate() {}

    public Candidate(String email, String password, String firstName, String lastName, int birthOfYear, String phoneNumber) {
        super(email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfYear = birthOfYear;
        this.phoneNumber = phoneNumber;
    }

    public Candidate(String firstName, String lastName, int birthOfYear, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfYear = birthOfYear;
        this.phoneNumber = phoneNumber;
    }

    public Candidate(int id, String email, String password, String firstName, String lastName, int birthOfYear, String phoneNumber) {
        super(id, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfYear = birthOfYear;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthOfYear() {
        return birthOfYear;
    }

    public void setBirthOfYear(int birthOfYear) {
        this.birthOfYear = birthOfYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
