package com.example.OnlineShop.service;

import com.example.OnlineShop.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    OrderDTO createOrder(OrderDTO dto);
    List<OrderDTO>getAllOrders();
}
