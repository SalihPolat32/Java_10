package com.salihpolat.service;

import com.salihpolat.model.Ev;
import com.salihpolat.repository.EvRepository;

import java.util.Optional;

public class EvService {

    private EvRepository evRepository;

    public EvService() {

        this.evRepository = new EvRepository();
    }

    public Ev evOlustur(Ev ev) {

        return evRepository.evOlustur(ev);
    }

    public Optional<Ev> evAraById(int id) {

        return evRepository.evAraById(id);
    }
}