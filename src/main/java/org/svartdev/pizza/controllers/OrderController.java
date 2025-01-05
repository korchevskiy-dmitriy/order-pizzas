package org.svartdev.pizza.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.svartdev.pizza.model.dto.OrdersDto;
import org.svartdev.pizza.model.entity.Customer;
import org.svartdev.pizza.model.entity.Order;
import org.svartdev.pizza.model.entity.Pizza;
import org.svartdev.pizza.services.CustomerService;
import org.svartdev.pizza.services.OrderService;
import org.svartdev.pizza.services.PizzaService;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final CustomerService customerService;
    private final PizzaService pizzaService;

    @PostMapping("/create")
    public ResponseEntity<Order> createOrder(
            @RequestBody OrdersDto ordersDto,
            @RequestParam Long customerId,
            @RequestParam List<Long> pizzaIds) {

        Customer customer = customerService.getCustomerById(customerId);
        if (customer == null) {
            return ResponseEntity.badRequest().body(null);
        }

        List<Pizza> pizzas = pizzaService.getPizzasByIds(pizzaIds);
        if (pizzas.isEmpty()) {
            return ResponseEntity.badRequest().body(null);
        }

        Order order = orderService.createOrder(ordersDto, customer, pizzas);
        return ResponseEntity.ok(order);
    }
}
