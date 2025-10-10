package com.chemtrack.IAM.service;

import com.chemtrack.IAM.dto.SigninRequest;
import com.chemtrack.IAM.dto.SignupRequest;
import com.chemtrack.IAM.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    String signup(SignupRequest request);
    boolean signin(SigninRequest request);
    List<UserDTO> getAllUsers();
    Optional<UserDTO> getUserById(Long id);
}