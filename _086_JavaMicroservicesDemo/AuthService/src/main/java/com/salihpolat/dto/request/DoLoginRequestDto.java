package com.salihpolat.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//Kaydederken kullanıcıdan alınacak bilgileri içeren DTO
@Builder // Bir sınıftan nesne türetmeyi sağlar.
@Data // get set metodlarını otomatik tanımlar.
@NoArgsConstructor // Boş constructor oluşturur.
@AllArgsConstructor // Dolu constructor oluşturur.
public class DoLoginRequestDto {

    @NotBlank(message = "Kullanıcı adi boş gecilemez.")
    @Size(min = 2, max = 50)
    private String username;

    private String password;
}