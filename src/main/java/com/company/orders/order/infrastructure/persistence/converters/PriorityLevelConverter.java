package com.company.orders.order.infrastructure.persistence.converters;

import java.util.Objects;

import com.company.orders.order.application.model.enums.PriorityLevel;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PriorityLevelConverter implements AttributeConverter<PriorityLevel, Integer>{

    @Override
    public Integer convertToDatabaseColumn(PriorityLevel attribute) {
        return Objects.isNull(attribute) ? null : attribute.getCode();
    }
    
    @Override
    public PriorityLevel convertToEntityAttribute(Integer code) {
        return Objects.isNull(code) ? null : PriorityLevel.fromCode(code);
    }
    
}
