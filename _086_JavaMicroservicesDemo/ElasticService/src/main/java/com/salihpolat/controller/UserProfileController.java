package com.salihpolat.controller;

import com.salihpolat.dto.request.PagingRequestDto;
import com.salihpolat.dto.request.UserProfileSaveRequestDto;
import com.salihpolat.repository.entity.UserProfile;
import com.salihpolat.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.salihpolat.constant.EndPoints.*;

//  http://localhost:9100/elastic/user
@RequiredArgsConstructor
@RestController
@RequestMapping(ELASTIC + USER)
public class UserProfileController {

    private final UserProfileService userProfileService;

    //  http://localhost:9100/elastic/user/save
/*
   @PostMapping(SAVE)
   public ResponseEntity<Boolean> save(@RequestBody UserProfileSaveRequestDto dto){

       return ResponseEntity.ok(userProfileService.saveDto(dto));
   }
*/

    @PostMapping(SAVE)
    public ResponseEntity<Void> addUser(@RequestBody UserProfileSaveRequestDto dto) {

        userProfileService.saveDto(dto);

        return ResponseEntity.ok().build();
    }

    //  http://localhost:9100/elastic/user/getall
    @GetMapping(GETALL)
    public ResponseEntity<Iterable<UserProfile>> getAll() {

        return ResponseEntity.ok(userProfileService.findAll());
    }

    //  http://localhost:9100/elastic/user/getallpage
    @PostMapping(GETALLPAGE)
    public ResponseEntity<Page<UserProfile>> getAll(@RequestBody PagingRequestDto dto) {

        return ResponseEntity.ok(userProfileService.findAll(dto));
    }

    // http://localhost:9100/elastic/user/hi
    @GetMapping("/hi")
    public String hi() {

        return "Hi: UserProfile Service";
    }
}