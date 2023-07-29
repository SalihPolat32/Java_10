package com.salihpolat.service;

import com.salihpolat.model.Ev;
import com.salihpolat.repository.EvRepository;

import java.util.List;

public class EvService {

    private EvRepository evRepository;

    public EvService() {
        this.evRepository = new EvRepository();
    }

    public Ev evOlustur(Ev ev) {
        return evRepository.evOlustur(ev);
    }

    public Ev evAraById(Long id) {
        return evRepository.evAraById(id);
    }

    public List<Ev> kiradakiEvler() {
        return evRepository.kiradakiEvler();
    }

    public List<Ev> musaitEvler() {
        return evRepository.musaitEvler();
    }
}