package org.svartdev.pizza.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.svartdev.pizza.model.entity.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza,Long> {
}
