package com.salihpolat.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder // Bir sınıftan nesne türetmeyi sağlar.
@Data // get set metodlarını otomatik tanımlar.
@NoArgsConstructor // Boş constructor oluşturur.
@AllArgsConstructor // Dolu constructor oluşturur.
public class PagingRequestDto {

    private Integer pageSize; // Bir İstekte Listenecek Kayıt Sayısı

    private Integer currentPage;  // Şu Andaki Bulunduğun Sayfa Numarası

    private String sortParameter; // Hangi Alana Göre Sıralayacağız.

    private String direction; // ASC A -> Z   0->9,  DESC  Z->A   9->0
}