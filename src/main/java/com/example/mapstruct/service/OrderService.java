package com.example.mapstruct.service;

import com.example.mapstruct.dto.OrderResponse;
import com.example.mapstruct.mapper.OrderMapper;
import com.example.mapstruct.model.Order;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class OrderService {

    public OrderResponse getOrderResponse() {
        Order order = new Order();
        order.setId(1L);
        order.setCustomerName("Alice Johnson");
        order.setProductName("Smartphone");
        order.setPrice(850.75);
        order.setOrderDate(LocalDate.of(2024, 11, 18));

        return OrderMapper.INSTANCE.orderToOrderResponse(order);
    }
}
