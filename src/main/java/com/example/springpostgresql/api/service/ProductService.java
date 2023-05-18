package com.example.springpostgresql.api.service;

import java.util.List;
import java.util.Optional;

import com.example.springpostgresql.api.model.ProductModel;

public interface ProductService {
    ProductModel save(ProductModel Product);

    List<ProductModel> findAll();

    Optional<ProductModel> findById(Long id);

    ProductModel productUpdate(ProductModel Product);

    void deleteById(Long id);
}
