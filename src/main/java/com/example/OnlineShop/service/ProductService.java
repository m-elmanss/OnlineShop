package com.example.OnlineShop.service;

import com.example.OnlineShop.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO createProduct(ProductDTO dto);
    List<ProductDTO>getAllProducts();
}
