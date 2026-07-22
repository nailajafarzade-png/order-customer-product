package com.example.onetomany.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @CreationTimestamp
    private Date orderDate;
    private Integer orderQuantity;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name="product_id")
    private ProductEntity product;
}
