package com.inventoryandsalessystem.product.controllers;

import com.inventoryandsalessystem.product.entities.Category;
import com.inventoryandsalessystem.product.entities.Product;
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
@RequestMapping("/api/v1/products")
public class ProducController {
    @Autowired
    private ProductServiceI productServiceI;

    //products (GET): Listar todos los productos.
    // @GetMapping()

    @PostMapping("/create") //products (POST): Crear un nuevo producto.
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productServiceI.createProduct(product), HttpStatus.OK);
    }

    @GetMapping("/{product_id}") //products/{id} (GET): Obtener información de un producto específico.
    public ResponseEntity<Product> findProduct(@PathVariable UUID product_id) {
        return new ResponseEntity<>(productServiceI.findProduct(product_id),HttpStatus.OK);
    }
    @PutMapping() //products/{id} (PUT): Actualizar información de un producto.
    public ResponseEntity<?> updateProduct() {
        return new ResponseEntity<>(null,HttpStatus.OK);
    }
    @DeleteMapping() //products/{id} (DELETE): Eliminar un producto.
    public ResponseEntity<?> deleteProduct() {
        return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
    }

}
