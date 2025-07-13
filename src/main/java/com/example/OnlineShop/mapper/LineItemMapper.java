package com.example.OnlineShop.mapper;

import com.example.OnlineShop.dto.LineItemDTO;
import com.example.OnlineShop.entity.LineItem;
import org.mapstruct.Mapper;

@Mapper
public interface LineItemMapper {
    LineItemDTO toDto(LineItem lineItem);
    LineItem toEntity(LineItemDTO lineItemDTO);
}
