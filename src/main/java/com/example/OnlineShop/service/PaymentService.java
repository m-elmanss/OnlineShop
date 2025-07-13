package com.example.OnlineShop.service;

import com.example.OnlineShop.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    PaymentDTO createPayment(PaymentDTO paymentDTO);
    List<PaymentDTO>getAllPayment(PaymentDTO paymentDTO);


}
