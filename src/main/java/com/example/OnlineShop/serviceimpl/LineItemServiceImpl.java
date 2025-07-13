package com.example.OnlineShop.serviceimpl;

import com.example.OnlineShop.dto.LineItemDTO;
import com.example.OnlineShop.entity.LineItem;
import com.example.OnlineShop.mapper.LineItemMapper;
import com.example.OnlineShop.repository.LineItemRepository;
import com.example.OnlineShop.service.LineItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LineItemServiceImpl implements LineItemService {

    private final LineItemRepository repository;
    private final LineItemMapper mapper;
    @Override
    public LineItemDTO createLineItem(LineItemDTO dto) {
        LineItem lineItem= mapper.toEntity(dto);
        return mapper.toDto(repository.save(lineItem));
    }

    @Override
    public List<LineItemDTO> getAllLineItems() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}
