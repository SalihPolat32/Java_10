package com.salihpolat.service;

public class AService implements SelectService {

    @Override
    public void sendMsg(String message) {
        System.out.println("A Service: " + message);
    }
}