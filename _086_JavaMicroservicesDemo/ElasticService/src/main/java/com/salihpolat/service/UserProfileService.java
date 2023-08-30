package com.salihpolat.service;

import com.salihpolat.dto.request.UserProfileSaveRequestDto;
import com.salihpolat.mapper.IUserProfileMapper;
import com.salihpolat.repository.IUserProfileRepository;
import com.salihpolat.repository.entity.UserProfile;
import com.salihpolat.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository iUserProfileRepository;

    public UserProfileService(IUserProfileRepository iUserProfileRepository) {

        super(iUserProfileRepository);

        this.iUserProfileRepository = iUserProfileRepository;
    }

    public Boolean saveDto(UserProfileSaveRequestDto dto) {

        if (!iUserProfileRepository.existsUserProfilesById(dto.getId())) {
            save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
            return true;
        }

        return false;
    }
}