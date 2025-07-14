package com.example.OnlineShop.serviceimpl;

import com.example.OnlineShop.dto.PaymentDTO;
import com.example.OnlineShop.entity.Payment;
import com.example.OnlineShop.mapper.PaymentMapper;
import com.example.OnlineShop.repository.PaymentRepository;
import com.example.OnlineShop.service.PaymentService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentMapper mapper;
    private final PaymentRepository repository;
    @Override
    public PaymentDTO createPayment(PaymentDTO paymentDTO) {
        Payment payment= mapper.toEntity(paymentDTO);
        return mapper.toDto(repository.save(payment));
    }

    @Override
    public List<PaymentDTO> getAllPayment() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}
