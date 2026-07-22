package com.example.onetomany.rest;

import com.example.onetomany.dto.response.OrderResponse;
import com.example.onetomany.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService service;

    @GetMapping
    public List<OrderResponse> findAll() {
        return service.findAll();
    }
}
