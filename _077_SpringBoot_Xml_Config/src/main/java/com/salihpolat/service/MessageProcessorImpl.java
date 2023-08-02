package com.salihpolat.service;

public class MessageProcessorImpl implements MessageProcessor {

    private SelectService selectService;

    public void setSelectService(SelectService selectService) {
        this.selectService = selectService;
    }

    @Override
    public void processMsg(String message) {
        selectService.sendMsg(message);
        System.out.println("Processing Message..." + message);
    }
}