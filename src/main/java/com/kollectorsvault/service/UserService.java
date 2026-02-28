package com.kollectorsvault.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.kollectorsvault.model.UserModel;
import com.kollectorsvault.repository.UserRepository;

public class UserService {
    
    @Autowired
    private UserRepository UserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserModel saveUser(UserModel user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return UserRepository.save(user);
    }

    public Optional<UserModel> searchForEmail(String email) {
        return UserRepository.findByEmail(email);
    }

}
