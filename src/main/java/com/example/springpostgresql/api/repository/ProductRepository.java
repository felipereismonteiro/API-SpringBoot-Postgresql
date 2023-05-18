package com.example.springpostgresql.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springpostgresql.api.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Long> { }
