package com.example.onetomany.service;

import com.example.onetomany.dao.entity.OrderEntity;
import com.example.onetomany.dao.repository.OrderRepository;
import com.example.onetomany.dto.response.OrderResponse;
import com.example.onetomany.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService {
    private final OrderRepository repository;
    private final OrderMapper mapper;

    public List<OrderResponse> findAll() {
        return repository.findAll().stream().map(mapper::toResponse).toList();
    }
}
