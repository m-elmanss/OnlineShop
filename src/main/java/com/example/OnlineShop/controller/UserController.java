package com.example.OnlineShop.controller;

import com.example.OnlineShop.dto.UserDto;
import com.example.OnlineShop.serviceimpl.UserServiceImpl;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl service;

    @PostMapping
    public ResponseEntity<UserDto>create(@RequestBody UserDto dto){
        return ResponseEntity.ok(service.createUser(dto));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>>getAllUsers(){
        return ResponseEntity.ok(service.listUsers());
    }
}
