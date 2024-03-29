package com.salihpolat.repository.entity;

import lombok.*;

import javax.persistence.*;

@Builder // Bir sınıftan nesne türetmeyi sağlar.
@Data // get set metodlarını otomatik tanımlar.
@NoArgsConstructor // Boş constructor oluşturur.
@AllArgsConstructor // Dolu constructor oluşturur.
@ToString
@Entity
@Table(name = "tblurun")
public class Urun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String ad;

    String marka;

    String model;

    Double fiyat;

    Double kdv;

    String img;

    String aciklama;

    String birim;
}