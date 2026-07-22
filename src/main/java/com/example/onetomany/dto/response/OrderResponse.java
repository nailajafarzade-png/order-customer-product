package com.example.onetomany.dto.response;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderResponse {
    private Long orderId;
    private Date orderDate;
    private Integer orderQuantity;
    private String customerName;
    private String customerEmail;
    private String productName;
    private BigDecimal productPrice;
}
