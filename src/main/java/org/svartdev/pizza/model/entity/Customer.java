package org.svartdev.pizza.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Table(schema = "pizza", name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Lazy loading для оптимизации
    private List<Order> orders = new ArrayList<>(); // Инициализация для избежания NPE

}
