package com.example.PizzariaWeb.repository;

import com.example.PizzariaWeb.model.Carrinho;
import com.example.PizzariaWeb.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
    List<Carrinho> findByUsuario(Usuario usuario);
}
