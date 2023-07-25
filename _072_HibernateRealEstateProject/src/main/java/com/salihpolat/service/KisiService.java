package com.salihpolat.service;

import com.salihpolat.model.Kisi;
import com.salihpolat.repository.KisiRepository;

public class KisiService {

    private KisiRepository kisiRepository;

    public KisiService() {

        this.kisiRepository = new KisiRepository();
    }

    public Kisi kisiOlustur(Kisi kisi) {

        return kisiRepository.kisiOlustur(kisi);
    }
}