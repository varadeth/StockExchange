package org.example.models;

import java.util.Date;

public class Order {
    private final Integer orderId;
    private final Date placedAt;
    private final String stockName;
    private final Category category;
    private final Double price;
    private final Integer quantity;

    public Order(Integer orderId, Date placedAt, String stockName, Category category, Double price, Integer quantity) {
        this.orderId = orderId;
        this.placedAt = placedAt;
        this.stockName = stockName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
}
