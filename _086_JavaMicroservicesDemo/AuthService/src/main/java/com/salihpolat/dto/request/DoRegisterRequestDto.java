package com.salihpolat.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

//Kaydederken kullanıcıdan alınacak bilgileri içeren DTO
@Builder // Bir sınıftan nesne türetmeyi sağlar.
@Data // get set metodlarını otomatik tanımlar.
@NoArgsConstructor // Boş constructor oluşturur.
@AllArgsConstructor // Dolu constructor oluşturur.
public class DoRegisterRequestDto {

    @NotBlank(message = "Kullanıcı Adı Boş Bırakılamaz!!!")
    private String username;

    // @Email(message = "Geçerli Bir Email Adresi Giriniz!!!")
    private String email;

    // TODO password Regex Yapılacak
    private String password;

    private String rePassword;
}