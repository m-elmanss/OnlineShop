package com.example.OnlineShop.controller;


import com.example.OnlineShop.dto.CustomerDTO;
import com.example.OnlineShop.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor

public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerDTO>create(@RequestBody CustomerDTO dto){
       return ResponseEntity.ok(customerService.createCustomer(dto));
    }

    @GetMapping
    public ResponseEntity<List<CustomerDTO>> getAll(){
        return ResponseEntity.ok(customerService.getAllCustomers());
    }
}
