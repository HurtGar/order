package com.company.orders.order.application.model;

import java.time.LocalDateTime;

import com.company.orders.order.application.model.enums.Currency;
import com.company.orders.order.infrastructure.persistence.converters.CurrencyConverter;

import jakarta.persistence.Convert;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "prices")
@Data
@NoArgsConstructor
public class Price {

    @EmbeddedId
    private PriceId id;

    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private Float price;

    @Convert(converter = CurrencyConverter.class)
    private Currency currency;

}