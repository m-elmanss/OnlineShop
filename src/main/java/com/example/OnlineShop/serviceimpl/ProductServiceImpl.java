package com.example.OnlineShop.serviceimpl;

import com.example.OnlineShop.dto.ProductDTO;
import com.example.OnlineShop.entity.Product;
import com.example.OnlineShop.mapper.ProductMapper;
import com.example.OnlineShop.repository.ProductRepository;
import com.example.OnlineShop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;
    @Override
    public ProductDTO createProduct(ProductDTO dto) {
        Product product=mapper.toEntity(dto);
        return mapper.toDto(repository.save(product));
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());

    }
}
