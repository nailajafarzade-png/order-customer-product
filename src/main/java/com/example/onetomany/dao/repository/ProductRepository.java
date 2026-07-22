package com.example.onetomany.dao.repository;

import com.example.onetomany.dao.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
