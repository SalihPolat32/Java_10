package com.salihpolat;

import java.util.Date;

public class Document {

    private String[] authors;
    private Date date;

    public void addAuthors(String[] name) {
        System.out.println("Author Name");
    }

    public String[] getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }
}