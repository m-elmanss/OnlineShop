package com.example.OnlineShop.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ProductDTO {
    private String id;
    private String name;
    private String supplier;

}
