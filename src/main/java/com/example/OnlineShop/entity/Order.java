package com.example.OnlineShop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id
    private String number;
    private LocalDate ordered;
    private LocalDate shipped;
    private String shipTo;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    private BigDecimal total;

    @ManyToOne
    private Account account;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<LineItem> lineItems;
}
