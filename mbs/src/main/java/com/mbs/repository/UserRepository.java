package com.mbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbs.entity.Product;
import com.mbs.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

