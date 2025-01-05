package org.svartdev.pizza.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.svartdev.pizza.model.dto.PizzasDto;
import org.svartdev.pizza.model.entity.Pizza;
import org.svartdev.pizza.services.PizzaService;


@RestController
@RequiredArgsConstructor
@RequestMapping("/pizzas")
public class PizzaController {

    private final PizzaService pizzaService;

    @PostMapping("/create")
    public ResponseEntity<Pizza> createPizza(@RequestBody PizzasDto pizzasDto) {
        Pizza pizza = pizzaService.createPizza(pizzasDto);
        return ResponseEntity.ok(pizza);
    }

}
