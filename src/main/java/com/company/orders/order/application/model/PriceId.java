package com.company.orders.order.application.model;

import java.io.Serializable;

import com.company.orders.order.application.model.enums.PriceListType;
import com.company.orders.order.application.model.enums.PriorityLevel;
import com.company.orders.order.infrastructure.persistence.converters.PriceListTypeConverter;
import com.company.orders.order.infrastructure.persistence.converters.PriorityLevelConverter;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Convert;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
public class PriceId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Nonnull
    @Convert(converter = PriceListTypeConverter.class)
    private PriceListType priceList;

    @Nonnull
    @Convert(converter = PriorityLevelConverter.class)
    private PriorityLevel priority;
}
