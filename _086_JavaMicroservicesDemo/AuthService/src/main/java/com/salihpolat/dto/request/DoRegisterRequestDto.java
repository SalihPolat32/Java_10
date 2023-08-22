package com.salihpolat.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

// Kaydederken kullanıcıdan alınacak bilgileri içeren DTO
@Builder // Bir sınıftan nesne türetmeyi sağlar.
@Data // get set metodlarını otomatik tanımlar.
@NoArgsConstructor // Boş constructor oluşturur.
@AllArgsConstructor // Dolu constructor oluşturur.
public class DoRegisterRequestDto {

    @NotBlank(message = "Kullanıcı Adı Boş Geçilemez!")
    private String username;

    // @Email(message = "Email giriniz")
    private String email;

    // TODO password Regex yap
    private String password;

    private String repassword;
}