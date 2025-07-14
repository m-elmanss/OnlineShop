package com.example.OnlineShop.controller;


import com.example.OnlineShop.dto.AccountDTO;
import com.example.OnlineShop.mapper.AccountMapper;
import com.example.OnlineShop.repository.AccountRepository;
import com.example.OnlineShop.service.AccountService;
import com.example.OnlineShop.serviceimpl.AccountServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/account")
public class AccountController {
    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountDTO> create(@RequestBody AccountDTO dto){
       return ResponseEntity.ok(accountService.createAccount(dto));
    }
    @GetMapping
    public ResponseEntity<List<AccountDTO>>getAllAccounts(){
        return ResponseEntity.ok(accountService.getAllAccounts());
    }

}
