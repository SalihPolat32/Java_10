package com.salihpolat.mapper;

import com.salihpolat.dto.request.MusteriSaveRequestDto;
import com.salihpolat.dto.response.MusteriFindAllResponseDto;
import com.salihpolat.repository.entity.Musteri;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-16T15:05:08+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class IMusteriMapperImpl implements IMusteriMapper {

    @Override
    public MusteriFindAllResponseDto fromMusteri(Musteri musteri) {
        if ( musteri == null ) {
            return null;
        }

        MusteriFindAllResponseDto.MusteriFindAllResponseDtoBuilder musteriFindAllResponseDto = MusteriFindAllResponseDto.builder();

        musteriFindAllResponseDto.username( musteri.getUsername() );
        musteriFindAllResponseDto.ad( musteri.getAd() );
        musteriFindAllResponseDto.img( musteri.getImg() );

        return musteriFindAllResponseDto.build();
    }

    @Override
    public Musteri fromSaveRequestDto(MusteriSaveRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Musteri.MusteriBuilder musteri = Musteri.builder();

        musteri.ad( dto.getAd() );
        musteri.adres( dto.getAdres() );
        musteri.tel( dto.getTel() );

        return musteri.build();
    }
}
