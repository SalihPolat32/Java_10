package com.salihpolat.controller;

import com.salihpolat.model.Ev;
import com.salihpolat.service.EvService;

import java.util.Optional;

public class EvController {

    private EvService evService;

    public EvController() {

        this.evService = new EvService();
    }

    public Ev evOlustur(Ev ev) {

        return evService.evOlustur(ev);
    }

    public Optional<Ev> evAraById(int id) {

        return evService.evAraById(id);
    }
}