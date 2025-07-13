package com.example.OnlineShop.service;

import com.example.OnlineShop.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO createCustomer(CustomerDTO dto);
    List<CustomerDTO>getAllCustomers();
}
