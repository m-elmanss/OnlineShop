package com.example.OnlineShop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDTO {
    private String id;
    private String billingAddress;
    private boolean isClosed;
    private LocalDate open;
    private LocalDate closed;
    private String customerId;
}
