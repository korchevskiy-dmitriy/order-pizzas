package org.svartdev.pizza.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Table(schema = "pizza", name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private LocalDateTime orderDate;

    @ManyToMany
    @JoinTable(
            name = "order_pizzas",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "pizza_id")
    )
    private List<Pizza> pizzas;



}
