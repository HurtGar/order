package com.company.orders.order.application.model.enums;

import lombok.Getter;

@Getter
public enum PriorityLevel {
    LOW(0, "Low"),
    HIGH(1, "High");

    private final Integer code;
    private final String description;
    
    PriorityLevel(Integer code, String description){
        this.code = code;
        this.description = description;
    }

    public static PriorityLevel fromCode(Integer code){
        for(PriorityLevel priority : PriorityLevel.values()){
            if(priority.getCode().equals(code)){
                return priority;
            }
        }
        throw new IllegalArgumentException("Invalid priority code: " + code);
    }
}
