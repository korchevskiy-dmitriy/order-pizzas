package org.svartdev.pizza.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.svartdev.pizza.model.dto.PizzasDto;
import org.svartdev.pizza.model.entity.Pizza;
import org.svartdev.pizza.model.repository.PizzaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PizzaService {

    private final PizzaRepository pizzaRepository;
    private final MappingService mappingService;

    public Pizza createPizza(PizzasDto pizzasDto) {
        Pizza pizza = mappingService.mapToPizzaEntity(pizzasDto);
        return pizzaRepository.save(pizza);
    }

    public List<Pizza> getPizzasByIds(List<Long> ids) {
        return pizzaRepository.findAllById(ids);
    }

    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }
}
