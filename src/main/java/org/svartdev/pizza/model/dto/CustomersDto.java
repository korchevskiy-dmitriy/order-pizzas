package org.svartdev.pizza.model.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
public class CustomersDto {

    private Long id;
    private String name;
    private String address;
    private List<Long> orderIds;

}
