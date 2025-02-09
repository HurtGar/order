package com.company.orders.order.infrastructure.persistence.converters;

import java.util.Objects;

import com.company.orders.order.application.model.enums.Currency;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CurrencyConverter implements AttributeConverter<Currency, Integer>{

    @Override
    public Integer convertToDatabaseColumn(Currency currency) {
        return Objects.isNull(currency) ? null : currency.getCode();
    }

    @Override
    public Currency convertToEntityAttribute(Integer code) {
        return Objects.isNull(code) ? null : Currency.fromCode(code);
    }
    
}
