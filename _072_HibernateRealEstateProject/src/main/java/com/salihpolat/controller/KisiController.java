package com.salihpolat.controller;

import com.salihpolat.model.Kisi;
import com.salihpolat.service.KisiService;

public class KisiController {

    private KisiService kisiService;

    public KisiController() {

        this.kisiService = new KisiService();
    }

    public Kisi kisiOlustur(Kisi kisi){
        return kisiService.kisiOlustur(kisi);
    }

    public Kisi kisiAraById(Long id) {
        return kisiService.kisiAraById(id);
    }
}