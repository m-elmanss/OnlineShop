package com.example.OnlineShop.dto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
}
