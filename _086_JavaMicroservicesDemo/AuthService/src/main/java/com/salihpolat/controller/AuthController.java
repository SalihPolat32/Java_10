package com.salihpolat.controller;

import com.salihpolat.constant.EndPoints;
import com.salihpolat.dto.request.RegisterRequestDto;
import com.salihpolat.repository.entity.Auth;
import com.salihpolat.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(EndPoints.AUTH)
public class AuthController {

    private final AuthService authService;

    @PostMapping(EndPoints.REGISTER)
    public ResponseEntity<Auth> register(@RequestBody RegisterRequestDto dto) {
        /*
        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());
        auth.setEmail(dto.getEmail());
        auth.setPassword(dto.getPassword());
        */
        Auth auth = authService.save(
                Auth.builder()
                        .username(dto.getUsername())
                        .email(dto.getEmail())
                        .password(dto.getPassword())
                        .build());

        return ResponseEntity.ok(auth);
    }
}