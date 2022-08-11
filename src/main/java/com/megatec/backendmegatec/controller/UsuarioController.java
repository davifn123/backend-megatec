package com.megatec.backendmegatec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megatec.backendmegatec.model.Usuario;
import com.megatec.backendmegatec.services.UsuarioService;
import com.megatec.classesid.UsuarioId;

@RestController

@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @CrossOrigin(origins = "*")
    @PostMapping
    public Usuario adicionar(@RequestBody Usuario usuario) {
        return usuarioService.adicionar(usuario);

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/listarTodos")
    public List<Usuario> obterTodos() {

        return usuarioService.obterTodos();
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    public Usuario obterPorId(@RequestBody UsuarioId usuarioId) {

        return usuarioService.obterPorId(usuarioId);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/cpf/{cpfUsuario}")
    public Usuario findByCpf(@PathVariable String cpfUsuario) {

        return usuarioService.findByCpf(cpfUsuario);

    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/deletar")
    public String deletar(@RequestBody UsuarioId usuarioId) {
        usuarioService.deletar(usuarioId);
        return "Produto com id: " + usuarioId + " Deletado com sucesso!";
    }

    @PutMapping
    public Usuario atualizar(@RequestBody Usuario usuario) {
        return usuarioService.atualizar(usuario);

    }

}
