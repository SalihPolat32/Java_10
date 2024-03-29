package com.salihpolat.controller;

import com.salihpolat.dto.request.DoLoginRequestDto;
import com.salihpolat.dto.request.DoRegisterRequestDto;
import com.salihpolat.exception.AuthServiceException;
import com.salihpolat.exception.ErrorType;
import com.salihpolat.repository.entity.Auth;
import com.salihpolat.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.salihpolat.constant.EndPoints.*;

//  http://localhost:9090/auth
@RequiredArgsConstructor
@RestController
@RequestMapping(AUTH)
public class AuthController {

    private final AuthService authService;

    //  http://localhost:9090/auth/register
    @PostMapping(REGISTER)
    public ResponseEntity<Auth> doRegister(@RequestBody @Valid DoRegisterRequestDto dto) {
/*
        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());
        auth.setEmail(dto.getEmail());
        auth.setPassword(dto.getPassword());
        authService.save(auth);

        return ResponseEntity.ok(auth);
*/
/*
        Auth auth = authService.save(
                Auth.builder()
                        .username(dto.getUsername())
                        .email(dto.getEmail())
                        .password(dto.getPassword())
                        .build()
        );

        return ResponseEntity.ok(auth);
*/

        if (!dto.getPassword().equals(dto.getRepassword())) {
            throw new AuthServiceException(ErrorType.REGISTER_PASSWORD_MISMACTH);
        }

        return ResponseEntity.ok(authService.doRegister(dto));
    }

    //  http://localhost:9090/auth/login
    @PostMapping(LOGIN)
    public ResponseEntity<String> doLogin(@RequestBody @Valid DoLoginRequestDto dto) {

        return ResponseEntity.ok(authService.doLogin(dto));
    }

/*
    // Tokensiz
    //  http://localhost:9090/auth/getall
    @GetMapping(GETALL)
    public ResponseEntity<List<Auth>> findAll () {

        return ResponseEntity.ok(authService.findAll());
    }
*/

    // Tokenli
    //  http://localhost:9090/auth/getall
    @GetMapping(GETALL)
    public ResponseEntity<List<Auth>> findAll(String token) {

        return ResponseEntity.ok(authService.findAll(token));
    }

    // http://localhost:9090/auth/hi
    @GetMapping("/hi")
    public String hi() {
        return "Hi: Auth Service";
    }
}