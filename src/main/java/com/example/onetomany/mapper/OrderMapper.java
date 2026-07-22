package com.example.onetomany.mapper;

import com.example.onetomany.dao.entity.OrderEntity;
import com.example.onetomany.dto.request.OrderRequest;
import com.example.onetomany.dto.response.OrderResponse;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderMapper {
    public OrderResponse toResponse(OrderEntity entity){
        OrderResponse response = new OrderResponse();
        response.setOrderId(entity.getOrderId());
        response.setOrderDate(entity.getOrderDate());
        response.setOrderQuantity(entity.getOrderQuantity());
        response.setCustomerName(entity.getCustomer().getCustomerName());
        response.setCustomerEmail(entity.getCustomer().getCustomerEmail());
        response.setProductName(entity.getProduct().getProductName());
        response.setProductPrice(entity.getProduct().getProductPrice());
        return response;

    }

    public OrderEntity toEntity(OrderRequest request){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderQuantity(orderEntity.getOrderQuantity());
        return orderEntity;
    }

}
