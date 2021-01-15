package com.labwork.sitespring.service;

import com.labwork.sitespring.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO getUserById(Long id);
    List<UserDTO> getAllUsers();
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO);
    void deleteUserById(Long id);
}
