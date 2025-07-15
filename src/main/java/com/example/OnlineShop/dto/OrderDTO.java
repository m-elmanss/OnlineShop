package com.example.OnlineShop.dto;

import com.example.OnlineShop.entity.OrderStatus;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class OrderDTO {
    private String number;
    private LocalDate ordered;
    private LocalDate shipped;
    private String shipTo;
    private OrderStatus status;
    private BigDecimal total;
}
