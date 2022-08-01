package com.megatec.backendmegatec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megatec.backendmegatec.model.Usuario;
import com.megatec.backendmegatec.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obterTodos() {
        // regra de negocio caso tenha
        return usuarioRepository.obterTodos();
    }

    public Optional<Usuario> obterPorId(Integer id) {

        return usuarioRepository.obterPorId(id);

    }

    public Usuario adicionar(Usuario usuario) {
        return usuarioRepository.adicionar(usuario);
    }

    public void deletar(Integer id) {
        usuarioRepository.deletar(id);
    }

    public Usuario alterar(Integer id, Usuario usuario) {
        usuario.setId(id);
        return usuarioRepository.alterar(usuario);
    }

}
