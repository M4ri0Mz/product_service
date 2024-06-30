package com.inventoryandsalessystem.product.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
private UUID id;
private String name;
private String description;
private Double price;
private Integer Stock;

// Category
}
