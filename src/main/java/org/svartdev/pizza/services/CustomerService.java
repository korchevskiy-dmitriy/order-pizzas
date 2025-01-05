package org.svartdev.pizza.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.svartdev.pizza.model.dto.CustomersDto;
import org.svartdev.pizza.model.entity.Customer;
import org.svartdev.pizza.model.repository.CustomerRepository;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
public class CustomerService {

    private final MappingService mappingService;
    private final CustomerRepository customerRepository;


    public Customer createCustomer(CustomersDto customersDto) {
        Customer customer = mappingService.mapToCustomerEntity(customersDto, List.of());
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

}
