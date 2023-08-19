package com.salihpolat.mapper;

import com.salihpolat.dto.request.DoRegisterRequestDto;
import com.salihpolat.repository.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAuthMapper {
    IAuthMapper INSTANCE = Mappers.getMapper(IAuthMapper.class);

    Auth toAuth(final DoRegisterRequestDto dto);
}