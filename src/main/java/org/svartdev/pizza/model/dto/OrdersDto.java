package org.svartdev.pizza.model.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class OrdersDto {

    private Long id;
    private Long customerId;
    private LocalDateTime orderDate;
    private List<Long> pizzaIds;
}
