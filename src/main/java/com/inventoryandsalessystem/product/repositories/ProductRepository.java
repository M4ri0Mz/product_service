package com.inventoryandsalessystem.product.repositories;

import com.inventoryandsalessystem.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
