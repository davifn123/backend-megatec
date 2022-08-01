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
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> obterPorId(Integer id) {

        return usuarioRepository.findById(id);

    }

    public Usuario adicionar(Usuario usuario) {

        usuario.setId(null);
        return usuarioRepository.save(usuario);
    }

    public void deletar(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario alterar(Integer id, Usuario usuario) {
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

}
