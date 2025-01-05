package org.svartdev.pizza.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.svartdev.pizza.model.dto.CustomersDto;
import org.svartdev.pizza.model.entity.Customer;
import org.svartdev.pizza.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/create")
    public ResponseEntity<Customer> createCustomer(@RequestBody CustomersDto customersDto) {
        Customer customer = customerService.createCustomer(customersDto);
        return ResponseEntity.ok(customer);
    }

}
