package org.svartdev.pizza.model.dto;

import lombok.*;


@Data
@Builder
public class PizzasDto {

    private Long id;
    private String name;
    private Double price;
}
