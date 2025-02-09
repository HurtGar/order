package com.company.orders.order.application.model.enums;

import lombok.Getter;

@Getter
public enum PriceListType {

    Tarifa_1(1, "Tarifa_1"),
    Tarifa_2(2, "Tarifa_2"),
    Tarifa_3(3, "Tarifa_3");

    private final Integer code;
    private final String description;

    PriceListType(Integer code, String description){
        this.code = code;
        this.description = description;
    }

    public static PriceListType fromCode(Integer code){
        for(PriceListType typeOfPrice : PriceListType.values()){
            if(typeOfPrice.getCode().equals(code)){
                return typeOfPrice;
            }
        }
        throw new IllegalArgumentException("Invalid price list code: " + code);
    }
}
