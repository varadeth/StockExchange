package org.example.models;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

public class OrderTest {

    @Test
    public void shouldCreateOrder() {
        Date date = new Date();
        Order order = new Order(1, date, "BAC", Category.SELL, 240.12, 100);
        assertNotNull(order);
    }
}
