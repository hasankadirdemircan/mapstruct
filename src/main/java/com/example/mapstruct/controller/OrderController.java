package com.example.mapstruct.controller;

import com.example.mapstruct.dto.OrderResponse;
import com.example.mapstruct.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/response")
    public OrderResponse getOrderResponse() {
        return orderService.getOrderResponse();
    }
}
