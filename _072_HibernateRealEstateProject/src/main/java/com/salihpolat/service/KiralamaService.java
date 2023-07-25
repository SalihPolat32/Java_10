package com.salihpolat.service;

import com.salihpolat.repository.KiralamaRepository;

public class KiralamaService {

    private KiralamaRepository kiralamaRepository;

    public KiralamaService() {

        this.kiralamaRepository = new KiralamaRepository();
    }

    public void kiradakiEvler() {

        kiralamaRepository.kiradakiEvler();
    }
}