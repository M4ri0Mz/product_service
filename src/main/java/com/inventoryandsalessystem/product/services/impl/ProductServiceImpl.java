package com.inventoryandsalessystem.product.services.impl;

import com.inventoryandsalessystem.product.entities.Product;
import com.inventoryandsalessystem.product.repositories.ProductRepository;
import com.inventoryandsalessystem.product.services.ProductServiceI;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class ProductServiceImpl implements ProductServiceI {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findProduct(UUID product_id) {
        return productRepository.findById(product_id)
                .orElseThrow( ()-> new RuntimeException("Product not found"));
    }
}
