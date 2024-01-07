package com.NeumTi.SpringularTest.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String jobTitle;
    private String phone;

    public Employee() {}

    public Employee(String firstName, String lastName, String email, String jobTitle, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee[id=" + id + " firstName=" + firstName + " lastName=" + lastName
                + " email=" + email + " jobTitle=" + jobTitle + " phone=" + phone + "]"
        );
    }

    public Long getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
