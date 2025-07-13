package com.example.OnlineShop.mapper;

import com.example.OnlineShop.dto.ProductDTO;
import com.example.OnlineShop.entity.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {
    ProductDTO toDto(Product product);
    Product toEntity(ProductDTO productDTO);
}
