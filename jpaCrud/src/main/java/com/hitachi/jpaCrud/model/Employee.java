package com.hitachi.jpaCrud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "First_Name", nullable = false)
    private String firstName;
    @Column(name = "Last_Name", nullable = false)
    private String lastName;
    @Column(name = "Email_Address", nullable = false)
    private String emailAddress;

    public Employee() {
    }

    public Employee(String FirstName, String LastName, String EmailAddress) {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.emailAddress = EmailAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String toString() {
        return "emp id =" + id + "Firstname = " + firstName + "Last Name =" + lastName + "EmailId =" + emailAddress;
    }
}