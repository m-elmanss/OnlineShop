package com.example.OnlineShop.repository;

import com.example.OnlineShop.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {
}
