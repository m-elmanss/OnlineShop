package com.example.OnlineShop.repository;

import com.example.OnlineShop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
