package com.example.OnlineShop.repository;

import com.example.OnlineShop.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
