package com.salihpolat.mapper;

import com.salihpolat.dto.request.UserProfileSaveRequestDto;
import com.salihpolat.repository.entity.UserProfile;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-24T17:31:50+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8.1 (Amazon.com Inc.)"
)
@Component
public class IUserProfileMapperImpl implements IUserProfileMapper {

    @Override
    public UserProfile toUserProfile(UserProfileSaveRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserProfile.UserProfileBuilder userProfile = UserProfile.builder();

        userProfile.authid( dto.getAuthid() );
        userProfile.username( dto.getUsername() );
        userProfile.email( dto.getEmail() );

        return userProfile.build();
    }
}
