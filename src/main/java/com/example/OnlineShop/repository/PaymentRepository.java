package com.example.OnlineShop.repository;

import com.example.OnlineShop.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,String> {
}
