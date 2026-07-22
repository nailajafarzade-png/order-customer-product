package com.example.onetomany.dao.repository;

import com.example.onetomany.dao.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
