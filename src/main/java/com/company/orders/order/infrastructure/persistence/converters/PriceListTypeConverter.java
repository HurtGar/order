package com.company.orders.order.infrastructure.persistence.converters;

import java.util.Objects;

import com.company.orders.order.application.model.enums.PriceListType;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PriceListTypeConverter implements AttributeConverter<PriceListType, Integer>{

    @Override
    public Integer convertToDatabaseColumn(PriceListType priceListType) {
        return Objects.isNull(priceListType) ? null : priceListType.getCode();
    }

    @Override
    public PriceListType convertToEntityAttribute(Integer code) {
        return Objects.isNull(code) ? null : PriceListType.fromCode(code);
    }
    
}
