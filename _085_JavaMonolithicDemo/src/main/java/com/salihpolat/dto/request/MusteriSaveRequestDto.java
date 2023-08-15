package com.salihpolat.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Kaydederken kullanıcıdan alınacak bilgileri içeren DTO
@Builder // Bir sınıftan nesne türetmeyi sağlar.
@Data // get set metodlarını otomatik tanımlar.
@NoArgsConstructor // Boş constructor oluşturur.
@AllArgsConstructor // Dolu constructor oluşturur.
public class MusteriSaveRequestDto {

    String ad;

    String adres;

    String tel;

    String token;

    String ip;

    String userpcmodel;
}