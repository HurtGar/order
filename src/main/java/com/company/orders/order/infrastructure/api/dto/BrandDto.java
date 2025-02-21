package com.company.orders.order.infrastructure.api.dto;

import lombok.Data;

@Data
public class BrandDto {
    
    private Integer id;
    private String brandName;

    public BrandDto(Integer id, String brandName){
        this.id = id;
        this.brandName = brandName;
    }
}
