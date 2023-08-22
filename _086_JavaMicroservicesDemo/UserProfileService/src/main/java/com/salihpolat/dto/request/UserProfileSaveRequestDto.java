package com.salihpolat.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder // Bir sınıftan nesne türetmeyi sağlar.
@Data // get set metodlarını otomatik tanımlar.
@NoArgsConstructor // Boş constructor oluşturur.
@AllArgsConstructor // Dolu constructor oluşturur.
public class UserProfileSaveRequestDto {

    private Long authid;

    private String username;

    private String email;
}