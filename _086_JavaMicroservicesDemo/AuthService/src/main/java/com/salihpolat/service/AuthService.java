package com.salihpolat.service;

import com.salihpolat.dto.request.DoLoginRequestDto;
import com.salihpolat.dto.request.DoRegisterRequestDto;
import com.salihpolat.exception.AuthServiceException;
import com.salihpolat.exception.ErrorType;
import com.salihpolat.manager.IUserProfileManager;
import com.salihpolat.mapper.IAuthMapper;
import com.salihpolat.repository.IAuthRepository;
import com.salihpolat.repository.entity.Auth;
import com.salihpolat.utility.JwtTokenManager;
import com.salihpolat.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthService extends ServiceManager<Auth, Long> {

    private final IAuthRepository repository;

    private final JwtTokenManager jwtTokenManager;

    private final IUserProfileManager userProfileManager;


    public AuthService(IAuthRepository repository, JwtTokenManager jwtTokenManager, IUserProfileManager userProfileManager) {

        super(repository);

        this.repository = repository;

        this.jwtTokenManager = jwtTokenManager;

        this.userProfileManager = userProfileManager;
    }

    public String doLogin(DoLoginRequestDto dto) {

        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());

        if (auth.isEmpty()) {
            throw new AuthServiceException(ErrorType.LOGIN_USERNAME_OR_PASSWORD_NOT_EXISTS);
        }

        // return    auth.get().getId().toString();

        return jwtTokenManager.createToken(auth.get().getId()).get();
    }

    public Auth doRegister(DoRegisterRequestDto dto) {

        Auth auth = IAuthMapper.INSTANCE.toAuth(dto);

        auth.setCreateAt(System.currentTimeMillis());

        auth.setState(true);

        save(auth);

        // TODO - DİĞER SERVİCE GİDİLECEK
        //  http://localhost:9093/user/save
/*
        userProfileManager.save(UserProfileSaveRequestDto.builder()
                        .authid(auth.getId())
                        .username(auth.getUsername())
                        .email(auth.getEmail())
                        .build() );
*/
        userProfileManager.save(IAuthMapper.INSTANCE.fromAuth(auth));

        return auth;
    }

    // Tokensiz
/*
    public List<Auth> findAll() {
        return repository.findAll();
    }
*/

    public List<Auth> findAll(String token) {

        Optional<Long> id = null;

        try {

            id = jwtTokenManager.getIdFromToken(token);

            System.out.println("ID: " + id);

        } catch (Exception e) {

            throw new AuthServiceException(ErrorType.INVALID_TOKEN);

        }

        if (findById(id.get()).isEmpty()) {
            throw new AuthServiceException(ErrorType.INVALID_TOKEN); // FIXME
        }

        return repository.findAll();
    }
}