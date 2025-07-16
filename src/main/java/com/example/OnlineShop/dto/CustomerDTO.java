package com.example.OnlineShop.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CustomerDTO {
    private String id;
    private String address;
    private String phone;
    private String email;
    private String password;
}
