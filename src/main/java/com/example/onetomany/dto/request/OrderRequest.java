package com.example.onetomany.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequest {
    private Long customerId;
    private Long productId;
    private Integer orderQuantity;
}
