package com.inventoryandsalessystem.product.services;

import com.inventoryandsalessystem.product.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductServiceI {
    public Product createProduct(Product product);
    public Product findProduct(UUID product_id);
}
