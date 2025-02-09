package com.company.orders.order.application.model.enums;

import lombok.Getter;

@Getter
public enum Currency {
    EUR(1, "EUR"),
    USD(2, "USD"),
    GBP(3, "GBP");

    private final Integer code;
    private final String description;

    Currency(Integer code, String description){
        this.code = code;
        this.description = description;
    }

    public static Currency fromCode(Integer code){
        for(Currency typeOfPrice : Currency.values()){
            if(typeOfPrice.getCode().equals(code)){
                return typeOfPrice;
            }
        }
        throw new IllegalArgumentException("Invalid currency code: " + code);
    }
}