package com.example.OnlineShop.controller;

import com.example.OnlineShop.dto.ProductDTO;
import com.example.OnlineShop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;
    @PostMapping
    public ResponseEntity<ProductDTO>create(@RequestBody ProductDTO dto){
        return ResponseEntity.ok(productService.createProduct(dto));
    }
    @GetMapping
    public ResponseEntity<List<ProductDTO>>getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }
}
