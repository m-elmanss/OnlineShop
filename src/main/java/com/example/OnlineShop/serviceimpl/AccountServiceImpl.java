package com.example.OnlineShop.serviceimpl;

import com.example.OnlineShop.dto.AccountDTO;
import com.example.OnlineShop.entity.Account;
import com.example.OnlineShop.mapper.AccountMapper;
import com.example.OnlineShop.repository.AccountRepository;
import com.example.OnlineShop.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountMapper mapper;
    private final AccountRepository repository;

    @Override
    public AccountDTO createAccount(AccountDTO dto) {
        Account account=mapper.toEntity(dto);
        return mapper.toDto(repository.save(account));
    }

    @Override
    public List<AccountDTO> getAllAccounts() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}
