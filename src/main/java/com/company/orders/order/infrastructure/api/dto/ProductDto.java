package com.company.orders.order.infrastructure.api.dto;

import com.company.orders.order.application.model.Brand;

import lombok.Data;

@Data
public class ProductDto {
    
    private Long id;
    private String name;
    private Brand brand;

    public ProductDto(Long id, String name, Brand brand){
        this.id = id;
        this.name = name;
        this.brand = brand;
    }

}
