package com.example.OnlineShop.controller;

import com.example.OnlineShop.dto.LineItemDTO;
import com.example.OnlineShop.service.LineItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/lineorder")
public class LineOrderController {
    private final LineItemService lineItemService;
    @PostMapping
    public ResponseEntity<LineItemDTO>create(@RequestBody LineItemDTO dto){
        return ResponseEntity.ok(lineItemService.createLineItem(dto));
    }

    @GetMapping
    public ResponseEntity<List<LineItemDTO>>getAllLines(){
        return ResponseEntity.ok(lineItemService.getAllLineItems());
    }
}
