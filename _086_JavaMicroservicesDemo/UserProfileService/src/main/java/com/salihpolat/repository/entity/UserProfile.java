package com.salihpolat.repository.entity;

import lombok.*;

import javax.persistence.*;

@Builder // Bir sınıftan nesne türetmeyi sağlar.
@Data // get set metodlarını otomatik tanımlar.
@NoArgsConstructor // Boş constructor oluşturur.
@AllArgsConstructor // Dolu constructor oluşturur.
@ToString
@Entity
@Table(name = "tbl_user_profile")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long authid;

    private String username;

    private String email;

    private String ad;

    private String address;

    private String phone;

    private String avatar;


    private Long createAt;

    private boolean state;
}