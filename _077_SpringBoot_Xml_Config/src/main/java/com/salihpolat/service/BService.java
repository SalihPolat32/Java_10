package com.salihpolat.service;

public class BService implements SelectService {

    @Override
    public void sendMsg(String message) {
        System.out.println("B Service: " + message);
    }
}