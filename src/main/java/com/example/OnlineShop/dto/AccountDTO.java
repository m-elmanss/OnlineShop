package com.example.OnlineShop.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class AccountDTO {
    private String id;
    private String billingAddress;
    private boolean isClosed;
    private LocalDate open;
    private LocalDate closed;
    private String customerId;
}
