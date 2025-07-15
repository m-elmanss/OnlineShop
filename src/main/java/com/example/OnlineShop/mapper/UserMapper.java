package com.example.OnlineShop.mapper;


import com.example.OnlineShop.dto.UserDto;
import com.example.OnlineShop.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto ToDto(User user);
    User ToEntity(UserDto dto);

}
