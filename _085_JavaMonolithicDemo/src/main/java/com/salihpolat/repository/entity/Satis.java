package com.salihpolat.repository.entity;

import lombok.*;

import javax.persistence.*;

@Builder // Bir sınıftan nesne türetmeyi sağlar.
@Data // get set metodlarını otomatik tanımlar.
@NoArgsConstructor // Boş constructor oluşturur.
@AllArgsConstructor // Dolu constructor oluşturur.
@ToString
@Entity
@Table(name = "tblsatis")
public class Satis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;

    Long musteriid;

    Long urunid;

    Long tarih;

    Integer adet;

    Double birimfiyat;

    Double toplamfiyat;
}