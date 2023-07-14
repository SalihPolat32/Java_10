package com.salihpolat.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID", nullable = false)
    private int id;
    @Column (name = "FIRST_NAME", length = 40, nullable = false)
    private String firstName;
    @Column (name = "LAST_NAME", length = 50)
    private String lastName;
    @Column (name = "ADDRESS", length = 60)
    private String address;
    @Column (name = "CREATION_DATE")
    private Date creationDate;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String address, Date creationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.creationDate = creationDate;
    }

    public Customer(int id, String firstName, String lastName, String address, Date creationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}