package com.example.OnlineShop.serviceimpl;

import com.example.OnlineShop.dto.OrderDTO;
import com.example.OnlineShop.entity.Order;
import com.example.OnlineShop.mapper.OrderMapper;
import com.example.OnlineShop.repository.OrderRepository;
import com.example.OnlineShop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderMapper mapper;
    private final OrderRepository repository;
    @Override
    public OrderDTO createOrder(OrderDTO dto) {
        Order order = mapper.toEntity(dto);
        return mapper.toDto(repository.save(order));
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}
