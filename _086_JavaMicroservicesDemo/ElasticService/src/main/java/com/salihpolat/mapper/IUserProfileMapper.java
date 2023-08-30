package com.salihpolat.mapper;

import com.salihpolat.dto.request.UserProfileSaveRequestDto;
import com.salihpolat.repository.entity.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserProfileMapper {

    IUserProfileMapper INSTANCE = Mappers.getMapper(IUserProfileMapper.class);

    @Mapping(target = "userProfileId", source = "id")
    UserProfile toUserProfile(final UserProfileSaveRequestDto dto);
}