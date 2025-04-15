package com.example.PizzariaWeb.repository;

import com.example.PizzariaWeb.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
