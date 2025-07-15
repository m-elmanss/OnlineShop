package com.example.OnlineShop.serviceimpl;


import com.example.OnlineShop.dto.UserDto;
import com.example.OnlineShop.entity.User;
import com.example.OnlineShop.mapper.UserMapper;
import com.example.OnlineShop.repository.UserRepository;
import com.example.OnlineShop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;
    @Override
    public UserDto createUser(UserDto dto) {
        User user = mapper.ToEntity(dto);
        return mapper.ToDto(repository.save(user));
    }

    @Override
    public List<UserDto> listUsers() {
        return repository.findAll()
                .stream()
                .map(mapper::ToDto)
                .collect(Collectors.toList());
    }
}
