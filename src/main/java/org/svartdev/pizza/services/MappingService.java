package org.svartdev.pizza.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.svartdev.pizza.model.dto.CustomersDto;
import org.svartdev.pizza.model.dto.OrdersDto;
import org.svartdev.pizza.model.dto.PizzasDto;
import org.svartdev.pizza.model.entity.Customer;
import org.svartdev.pizza.model.entity.Pizza;
import org.svartdev.pizza.model.entity.Order;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MappingService {

    public Customer mapToCustomerEntity(CustomersDto customersDto, List<Order> orders) {
        return Customer.builder()
                .id(customersDto.getId())
                .name(customersDto.getName())
                .address(customersDto.getAddress())
                .orders(orders)
                .build();
    }

    public Order mapToOrderEntity(OrdersDto ordersDto, Customer customer, List<Pizza> pizzas) {
        return Order.builder()
                .id(ordersDto.getId())
                .customer(customer)
                .orderDate(ordersDto.getOrderDate())
                .pizzas(pizzas)
                .build();
    }

    public Pizza mapToPizzaEntity(PizzasDto pizzasDto) {
        return Pizza.builder()
                .id(pizzasDto.getId())
                .name(pizzasDto.getName())
                .price(pizzasDto.getPrice())
                .build();
    }

}
