package com.example.PizzariaWeb.service;

import com.example.PizzariaWeb.model.Pizza;
import com.example.PizzariaWeb.repository.PizzaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {

    private final PizzaRepository repository;


    public PizzaService(PizzaRepository repository) {
        this.repository = repository;
    }

    public List<Pizza> listar(){
        return repository.findAll();
    }

    public Pizza salvar(Pizza pizza){
        return  repository.save(pizza);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
