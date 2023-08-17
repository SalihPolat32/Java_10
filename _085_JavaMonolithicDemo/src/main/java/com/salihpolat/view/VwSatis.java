package com.salihpolat.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder // Bir sınıftan nesne türetmeyi sağlar.
@Data // get set metodlarını otomatik tanımlar.
@NoArgsConstructor // Boş constructor oluşturur.
@AllArgsConstructor // Dolu constructor oluşturur.
public class VwSatis {

    Long satisid;

    Long musteriid;

    String musteriad;

    Long urunid;

    String urunad;

    Integer adet;

    Double birimfiyat;

    Double toplamfiyat;
}