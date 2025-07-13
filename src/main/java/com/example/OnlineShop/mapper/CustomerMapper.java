package com.example.OnlineShop.mapper;


import com.example.OnlineShop.dto.CustomerDTO;
import com.example.OnlineShop.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO toDto(Customer customer);
    Customer toEntity(CustomerDTO customerDTO);
}
