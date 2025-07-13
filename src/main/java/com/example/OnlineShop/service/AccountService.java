package com.example.OnlineShop.service;

import com.example.OnlineShop.dto.AccountDTO;
import com.example.OnlineShop.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDTO createAccount(AccountDTO dto);
    List<AccountDTO>getAllAccounts();
}
