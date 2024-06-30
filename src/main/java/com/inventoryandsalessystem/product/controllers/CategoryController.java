package com.inventoryandsalessystem.product.controllers;

import com.inventoryandsalessystem.product.entities.Category;
import com.inventoryandsalessystem.product.services.CategoryServiceI;
import com.inventoryandsalessystem.product.services.ProductServiceI;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/v1/categories")
public class CategoryController {
    @Autowired
    private CategoryServiceI categoryServiceI;

    //@GetMapping() //categories (GET): Listar todas las categorías.

    @PostMapping("/create")  //categories (POST): Crear una nueva categoría.
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        return new ResponseEntity<>(categoryServiceI.createCategory(category), HttpStatus.OK);
    }
    @PostMapping("/{category_id}")  //categories (POST): Crear una nueva categoría.
    public ResponseEntity<Category> findCategory(@PathVariable UUID category_id) {
        return new ResponseEntity<>(categoryServiceI.findCategory(category_id), HttpStatus.OK);
    }
}
