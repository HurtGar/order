package com.company.orders.order.infrastructure.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {
    
    @GetMapping("/saludo")
    public String getMethodName() {
        return new String("Hola mundo");
    }
    
}
