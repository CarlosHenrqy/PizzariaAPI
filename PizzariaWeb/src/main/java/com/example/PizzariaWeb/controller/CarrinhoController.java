package com.example.PizzariaWeb.controller;

import com.example.PizzariaWeb.model.Carrinho;
import com.example.PizzariaWeb.model.Usuario;
import com.example.PizzariaWeb.repository.CarrinhoRepository;
import com.example.PizzariaWeb.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrinho")
@CrossOrigin(origins = "*")
public class CarrinhoController {

    private final CarrinhoRepository carrinhoRepository;
    private final UsuarioRepository usuarioRepository;

    public CarrinhoController(CarrinhoRepository carrinhoRepository, UsuarioRepository usuarioRepository) {
        this.carrinhoRepository = carrinhoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    public Carrinho adicionar(@RequestBody Carrinho item){
        return  carrinhoRepository.save(item);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id){
        carrinhoRepository.deleteById(id);
    }

    @PostMapping("/finalizar")
    public String finalizarCompra(@RequestBody Usuario usuario){
        List<Carrinho> itens = carrinhoRepository.findByUsuario(usuario);
        carrinhoRepository.deleteAll(itens);
        return "Compra finalizada com sucesso!";
    }
}
