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

    public Optional<Usuario> obterPorId(String cpf) {

        return usuarioRepository.findById(id);

    }

    public Usuario adicionar(Usuario usuario) {

        usuario.setCpf(null);
        return usuarioRepository.save(usuario);
    }

    public void deletar(String cpf) {
        usuarioRepository.deleteById(cpf);
    }

    public Usuario alterar(String cpf, Usuario usuario) {
        usuario.setCpf(cpf);
        return usuarioRepository.save(usuario);
    }

}
