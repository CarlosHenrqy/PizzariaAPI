package com.example.PizzariaWeb.controller;

import com.example.PizzariaWeb.model.Pizza;
import com.example.PizzariaWeb.repository.PizzaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pizzas")
@CrossOrigin(origins = "*")
public class PizzaController {

    private final PizzaRepository pizzaRepository;

    public PizzaController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping
    public List<Pizza> listar(){
        return  pizzaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Pizza detalhes(@PathVariable Long id){
        return pizzaRepository.findById(id).orElse(null);

    }


}
