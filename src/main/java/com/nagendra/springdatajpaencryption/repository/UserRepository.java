package com.nagendra.springdatajpaencryption.repository;

import com.nagendra.springdatajpaencryption.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}