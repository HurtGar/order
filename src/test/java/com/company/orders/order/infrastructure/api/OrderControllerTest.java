package com.company.orders.order.infrastructure.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;

public class OrderControllerTest {

    private MockMvc mvc;

    @Mock
    private OrderController orderController;
    
    @BeforeEach
    void setup(){

    }

    @Test
    void when_getOrderWithBrandId_thenReturn_okResponse(){

    }
}
