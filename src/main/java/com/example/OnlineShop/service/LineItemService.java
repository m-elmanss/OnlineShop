package com.example.OnlineShop.service;

import com.example.OnlineShop.dto.LineItemDTO;

import java.util.List;

public interface LineItemService {
    LineItemDTO createLineItem(LineItemDTO dto);
    List<LineItemDTO>getAllLineItems();
}
