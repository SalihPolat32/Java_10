package com.salihpolat.service;

import com.salihpolat.repository.IAuthRepository;
import com.salihpolat.repository.entity.Auth;
import com.salihpolat.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class AuthService extends ServiceManager<Auth, Long> {

    private final IAuthRepository repository;

    public AuthService(IAuthRepository repository) {
        super(repository);
        this.repository = repository;
    }
}