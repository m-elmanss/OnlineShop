package com.example.OnlineShop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    private String id;
    private String address;
    private String phone;
    private String email;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Account account;

}
