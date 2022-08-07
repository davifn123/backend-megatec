package com.megatec.backendmegatec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megatec.backendmegatec.model.Usuario;
import com.megatec.backendmegatec.services.UsuarioService;
import com.megatec.classesId.UsuarioId;

@RestController

@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario adicionar(@RequestBody Usuario usuario) {
        return usuarioService.adicionar(usuario);

    }

    @GetMapping("/listarTodos")
    public List<Usuario> obterTodos() {

        return usuarioService.obterTodos();
    }

    @GetMapping("/{usuarioId}")
    public Usuario obterPorId(@RequestBody UsuarioId usuarioId) {

        return usuarioService.obterPorId(usuarioId);
    }

    @GetMapping("/cpf/{cpfUsuario}")
    public Usuario findByCpf(@RequestBody Usuario cpfUsuario) {
        return usuarioService.findByCpf(cpfUsuario);
    }

    @DeleteMapping("/deletar/{usuarioId}")
    public String deletar(@RequestBody UsuarioId usuarioId) {
        usuarioService.deletar(usuarioId);
        return "Usuario com id: " + usuarioId + " Deletado com Sucesso";
    }

    @PutMapping("/alterar/{usuarioId}")
    public Usuario alterar(@RequestBody Usuario usuario, @RequestBody UsuarioId usuarioId) {
        return usuarioService.alterar(usuarioId, usuario);
    }

}
