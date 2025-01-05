package org.svartdev.pizza.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.svartdev.pizza.model.dto.OrdersDto;
import org.svartdev.pizza.model.entity.Customer;
import org.svartdev.pizza.model.entity.Order;
import org.svartdev.pizza.model.entity.Pizza;
import org.svartdev.pizza.model.repository.OrderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final MappingService mappingService;

    public Order createOrder(OrdersDto ordersDto, Customer customer, List<Pizza> pizzas) {
        Order order = mappingService.mapToOrderEntity(ordersDto, customer, pizzas);
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}
