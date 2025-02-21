package com.company.orders.order.infrastructure.api.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PriceDto {
    
    private Integer brandId;
    private Long productId;
    private Integer priceListCode;
    private Integer priorityCode;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Float price;
    private Integer currencyCode;

    public PriceDto(Integer brandId, Long productId, Integer priceListCode, Integer priorityCode,
            LocalDateTime startDate, LocalDateTime endDate, Float price, Integer currencyCode) {
        this.brandId = brandId;
        this.productId = productId;
        this.priceListCode = priceListCode;
        this.priorityCode = priorityCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.currencyCode = currencyCode;
    }
}
