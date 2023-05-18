package com.example.springpostgresql.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springpostgresql.api.model.ProductModel;
import com.example.springpostgresql.api.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    /*
     * A camada de serviço possui
     * o objetivo de trata exclusivamente as
     * regras de negócio de nossa aplicação.
     */

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductModel save(ProductModel Product) {
        return productRepository.save(Product);
    }

    @Override
    public List<ProductModel> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductModel> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public ProductModel productUpdate(ProductModel Product) {
        return productRepository.save(Product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

}
