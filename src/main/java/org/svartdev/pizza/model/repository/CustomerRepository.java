package org.svartdev.pizza.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.svartdev.pizza.model.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
