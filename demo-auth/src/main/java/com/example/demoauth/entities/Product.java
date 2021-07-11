package com.example.demoauth.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Product {
    private String id;
    private String name;
    private double price;
    @DBRef
    private Category category;
}
