package com.salihpolat.model_entity;

import jakarta.persistence.*;

@Entity
public class Student {

/*
    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    private String id; // 9c64ff79-c4b5-478d-b691-fd5dbed0dd41
*/
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id; // 1, 2, 3, 4, 5, ...
    @Column (name = "FIRST_NAME")
    private String firstName;
    private String lastName;
    private String email;

    public Student() {
    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}