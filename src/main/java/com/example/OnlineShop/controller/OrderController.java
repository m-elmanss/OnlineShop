package com.example.OnlineShop.controller;

import com.example.OnlineShop.dto.OrderDTO;
import com.example.OnlineShop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    public ResponseEntity<OrderDTO>create(@RequestBody OrderDTO dto){
        return ResponseEntity.ok(orderService.createOrder(dto));
    }

    @GetMapping
    public ResponseEntity<List<OrderDTO>>getAllOrders(){
        return ResponseEntity.ok(orderService.getAllOrders());
    }
}
