package com.salihpolat.controller;

import com.salihpolat.dto.request.UserProfileSaveRequestDto;
import com.salihpolat.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.salihpolat.constant.EndPoints.SAVE;
import static com.salihpolat.constant.EndPoints.USER;

//  http://localhost:9093/user
@RequiredArgsConstructor
@RestController
@RequestMapping(USER)
public class UserProfileController {

    private final UserProfileService userProfileService;

    //  http://localhost:9093/user/save
    @PostMapping(SAVE)
    public ResponseEntity<Boolean> save(@RequestBody UserProfileSaveRequestDto dto) {

        return ResponseEntity.ok(userProfileService.saveDto(dto));
    }
}