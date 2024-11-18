package com.example.mapstruct.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Order {
    private Long id;
    private String customerName;
    private String productName;
    private Double price;
    private LocalDate orderDate;
}
