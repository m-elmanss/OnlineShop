package com.example.OnlineShop.service;

import com.example.OnlineShop.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto dto);
    List<UserDto>listUsers();
}
