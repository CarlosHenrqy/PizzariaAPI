package com.example.PizzariaWeb.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pizza pizza;

    @ManyToOne
    private Usuario usuario;

    private Integer quantidade;
}
