package com.mbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbs.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
