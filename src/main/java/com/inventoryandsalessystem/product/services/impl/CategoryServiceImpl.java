package com.inventoryandsalessystem.product.services.impl;

import com.inventoryandsalessystem.product.entities.Category;
import com.inventoryandsalessystem.product.repositories.CategoryRepository;
import com.inventoryandsalessystem.product.services.CategoryServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryServiceI {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category findCategory(UUID category_id) {
        return categoryRepository.findById(category_id)
                .orElseThrow( ()-> new RuntimeException("Category not found"));
    }
}
