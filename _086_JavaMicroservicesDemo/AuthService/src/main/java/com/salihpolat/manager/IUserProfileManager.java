package com.salihpolat.manager;

import com.salihpolat.dto.request.UserProfileSaveRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.salihpolat.constant.EndPoints.SAVE;

@FeignClient(name = "user-profile-manager",
        url = "http://localhost:9093/user",
        decode404 = true)
public interface IUserProfileManager {

    //    http://localhost:9093/user/save
    @PostMapping(SAVE)
    ResponseEntity<Boolean> save(@RequestBody UserProfileSaveRequestDto dto);
}