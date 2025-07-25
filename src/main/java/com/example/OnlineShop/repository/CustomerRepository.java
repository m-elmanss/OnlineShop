package com.example.OnlineShop.repository;

import com.example.OnlineShop.dto.CustomerDTO;
import com.example.OnlineShop.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,String> {
    Optional<CustomerDTO>findByEmail(String email);
}
