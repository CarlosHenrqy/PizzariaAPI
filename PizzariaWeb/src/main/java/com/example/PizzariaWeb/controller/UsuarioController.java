package com.example.PizzariaWeb.controller;

import com.example.PizzariaWeb.model.Usuario;
import com.example.PizzariaWeb.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;


    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping("/usuarios")
    public Usuario registrar(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @PostMapping
    public Usuario login(@RequestBody Usuario dadosLogin){
        return usuarioRepository.findByEmailAndSenha(
                dadosLogin.getEmail(), dadosLogin.getSenha()
        ).orElse(null);
    }
}
