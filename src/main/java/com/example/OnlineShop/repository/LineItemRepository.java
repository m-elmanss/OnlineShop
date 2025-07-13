package com.example.OnlineShop.repository;

import com.example.OnlineShop.entity.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineItemRepository extends JpaRepository<LineItem,Long> {
}
