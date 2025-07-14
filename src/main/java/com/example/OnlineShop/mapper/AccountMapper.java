package com.example.OnlineShop.mapper;

import com.example.OnlineShop.dto.AccountDTO;
import com.example.OnlineShop.entity.Account;
import org.mapstruct.Mapper;

@Mapper

public interface AccountMapper {
    AccountDTO toDto(Account account);
    Account toEntity(AccountDTO accountDTO);
}
