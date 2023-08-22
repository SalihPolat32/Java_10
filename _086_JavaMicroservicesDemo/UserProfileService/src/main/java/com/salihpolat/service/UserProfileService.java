package com.salihpolat.service;

import com.salihpolat.dto.request.UserProfileSaveRequestDto;
import com.salihpolat.repository.IUserProfileRepository;
import com.salihpolat.repository.entity.UserProfile;
import com.salihpolat.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository repository;

    public UserProfileService(IUserProfileRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Boolean saveDto(UserProfileSaveRequestDto dto) {
        return true;
    }
}