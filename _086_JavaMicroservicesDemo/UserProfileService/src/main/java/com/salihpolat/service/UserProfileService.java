package com.salihpolat.service;

import com.salihpolat.dto.request.UserProfileSaveRequestDto;
import com.salihpolat.manager.IElasticServiceManager;
import com.salihpolat.mapper.IUserProfileMapper;
import com.salihpolat.rabbitmq.model.SaveAuthModel;
import com.salihpolat.repository.IUserProfileRepository;
import com.salihpolat.repository.entity.UserProfile;
import com.salihpolat.utility.ServiceManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository userProfileRepository;

    private final IElasticServiceManager elasticServiceManager;

    public UserProfileService(IUserProfileRepository userProfileRepository, IElasticServiceManager elasticServiceManager) {

        super(userProfileRepository);

        this.userProfileRepository = userProfileRepository;

        this.elasticServiceManager = elasticServiceManager;
    }

    public Boolean saveDto(UserProfileSaveRequestDto dto) {
/*
         {
         "authid": 2,
         "username": "Abdullah",
         "email": "Abdullah@gmail.com"
         }
*/
/*
        UserProfile userProfile = new UserProfile();

        userProfile.setAuthid(dto.getAuthid());

        userProfile.setUsername(dto.getUsername());

        userProfile.setEmail(dto.getEmail());

        save(userProfile);
*/
/*
        UserProfile userProfile = UserProfile.builder()
                .authid(dto.getAuthid())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build();

        save(userProfile);
*/
/*
        save(UserProfile.builder()
                .authid(dto.getAuthid())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build());
*/
        save(IUserProfileMapper.INSTANCE.toUserProfile(dto));

        return true;
    }

    public void saveRabbit(SaveAuthModel model) {

        UserProfile userProfile = IUserProfileMapper.INSTANCE.toUserProfile(model);

        save(userProfile);

        elasticServiceManager.addUser(userProfile);
    }

    @Cacheable(value = "getUpperCase")
    public String getUpperCase(String firstName) {

        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }

        return firstName.toUpperCase();
    }

    @CacheEvict(value = "getUpperCase", allEntries = true)
    public void clearCache() {

        System.out.println("getUpperCase İçin Oluşlturulan Cache Değerleri Silindi.");
    }
}