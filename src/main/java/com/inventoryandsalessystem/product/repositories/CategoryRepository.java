package com.inventoryandsalessystem.product.repositories;

import com.inventoryandsalessystem.product.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
