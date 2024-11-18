package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.UserDTO;
import com.example.mapstruct.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    @Mapping(target = "id", ignore = true)
    User userDTOToUser(UserDTO userDTO);
}