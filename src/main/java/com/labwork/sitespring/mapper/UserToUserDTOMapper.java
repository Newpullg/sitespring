package com.labwork.sitespring.mapper;

import com.labwork.sitespring.dto.UserDTO;
import com.labwork.sitespring.entity.Abonement;
import com.labwork.sitespring.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserToUserDTOMapper {
    public User toEntity(final UserDTO userDTO){
        final User user = new User();

        user.setId(userDTO.getId());
        user.setEmail(userDTO.getEmail());
        user.setFirstname(userDTO.getFirstname());
        user.setLastname(userDTO.getLastname());
        user.setNumber(userDTO.getNumber());

        return user;
    }

    public UserDTO toDTO(final User user){
        final UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setFirstname(user.getFirstname());
        userDTO.setLastname(user.getLastname());
        userDTO.setNumber(user.getNumber());

        return userDTO;
    }
}
