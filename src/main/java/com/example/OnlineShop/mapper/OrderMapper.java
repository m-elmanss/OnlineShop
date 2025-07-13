package com.example.OnlineShop.mapper;

import com.example.OnlineShop.dto.OrderDTO;
import com.example.OnlineShop.entity.Order;
import org.mapstruct.Mapper;

@Mapper
public interface OrderMapper {
    OrderDTO toDto(Order order);
    Order toEntity(OrderDTO orderDTO);
}
