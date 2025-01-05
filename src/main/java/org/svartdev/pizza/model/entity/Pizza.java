package org.svartdev.pizza.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Table(schema = "pizza", name = "pizza")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

}
