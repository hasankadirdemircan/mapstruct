package com.example.mapstruct.service;

import com.example.mapstruct.dto.UserDTO;
import com.example.mapstruct.mapper.UserMapper;
import com.example.mapstruct.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserDTO getUserDTO() {
        User user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");

        return UserMapper.INSTANCE.userToUserDTO(user);
    }

    public User createUser(UserDTO userDTO) {
        return UserMapper.INSTANCE.userDTOToUser(userDTO);
    }
}