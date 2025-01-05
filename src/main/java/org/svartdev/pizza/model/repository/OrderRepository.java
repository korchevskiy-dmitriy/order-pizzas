package org.svartdev.pizza.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.svartdev.pizza.model.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
