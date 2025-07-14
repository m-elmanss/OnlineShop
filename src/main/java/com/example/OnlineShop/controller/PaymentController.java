package com.example.OnlineShop.controller;

import com.example.OnlineShop.dto.PaymentDTO;
import com.example.OnlineShop.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/payment")
public class PaymentController {
    private final PaymentService paymentService;
    @PostMapping
    public ResponseEntity<PaymentDTO>create(@RequestBody PaymentDTO dto){
        return ResponseEntity.ok(paymentService.createPayment(dto));
    }
    @GetMapping
    public ResponseEntity<List<PaymentDTO>>getAllPayments(){
        return ResponseEntity.ok(paymentService.getAllPayment());
    }
}
