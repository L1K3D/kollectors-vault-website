package com.kollectorsvault.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kollectorsvault.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    Optional<UserModel> findByEmail(String email);

}