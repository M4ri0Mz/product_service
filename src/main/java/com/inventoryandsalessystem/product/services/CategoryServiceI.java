package com.inventoryandsalessystem.product.services;

import com.inventoryandsalessystem.product.entities.Category;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryServiceI {
    public Category createCategory(Category category);
    public Category findCategory(UUID category_id);
}
