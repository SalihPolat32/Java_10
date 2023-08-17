package com.salihpolat.repository.entity;

import lombok.*;

import javax.persistence.*;

@Builder // Bir sınıftan nesne türetmeyi sağlar.
@Data // get set metodlarını otomatik tanımlar.
@NoArgsConstructor // Boş constructor oluşturur.
@AllArgsConstructor // Dolu constructor oluşturur.
@ToString
@Entity
@Table(name = "tblmusteri")
public class Musteri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String ad;

    String adres;

    String tel;

    String il;

    String username;

    String password;

    String email;

    String img;
}