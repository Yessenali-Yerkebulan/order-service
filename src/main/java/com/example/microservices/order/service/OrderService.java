package com.example.microservices.order.service;

import com.example.microservices.order.dto.OrderRequest;

public interface OrderService {
    void placeOrder(OrderRequest orderRequest);
}
