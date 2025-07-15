package com.example.OnlineShop.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class LineItemDTO {
    private Long id;
    private int quantity;
    private BigDecimal price;

}
