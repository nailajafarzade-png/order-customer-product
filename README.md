# Order Customer Product

A simple Spring Boot project demonstrating **One-to-Many** and **Many-to-One** relationships using Spring Data JPA and PostgreSQL.

## Technologies
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Lombok

## Entities
- Customer
- Product
- Order

## Relationships
- One Customer → Many Orders
- One Product → Many Orders

## API
### GET /orders

Returns all orders with customer and product information.

## Sample Response

```json
[
  {
    "orderId": 1,
    "orderDate": "2026-07-22T05:26:07.810Z",
    "orderQuantity": 2,
    "customerName": "Ali Aliyev",
    "customerEmail": "ali@gmail.com",
    "productName": "Laptop",
    "productPrice": 2500.00
  }
]
```
