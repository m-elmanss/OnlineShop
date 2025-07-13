package com.example.OnlineShop.serviceimpl;

import com.example.OnlineShop.dto.CustomerDTO;
import com.example.OnlineShop.entity.Customer;
import com.example.OnlineShop.mapper.CustomerMapper;
import com.example.OnlineShop.repository.CustomerRepository;
import com.example.OnlineShop.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper mapper;
    private final CustomerRepository repository;
    @Override
    public CustomerDTO createCustomer(CustomerDTO dto) {
        Customer customer =mapper.toEntity(dto);
        return mapper.toDto(repository.save(customer));
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
         return repository.findAll()
                 .stream()
                 .map(mapper::toDto)
                 .collect(Collectors.toList());
    }
}
