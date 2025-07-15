package com.example.OnlineShop.mapper;

import com.example.OnlineShop.dto.PaymentDTO;
import com.example.OnlineShop.entity.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface PaymentMapper {
    PaymentDTO toDto(Payment payment);
    Payment toEntity(PaymentDTO paymentDTO);

}
