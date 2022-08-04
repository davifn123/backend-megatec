package com.megatec.backendmegatec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megatec.backendmegatec.model.Usuario;
import com.megatec.backendmegatec.repository.UsuarioRepository;
import com.megatec.classesid.UsuarioId;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obterTodos() {
        // regra de negocio caso tenha
        return usuarioRepository.findAll();
    }

    public Usuario obterPorId(UsuarioId usuarioId) {

        return usuarioRepository.findByIdAndCodSistema(usuarioId.getId(), usuarioId.getCodSistema());

    }

    public Usuario obterPorCpf(Usuario usuario) {

        return usuarioRepository.findByCpf(usuario.getCpf_usuario());

    }

    public Usuario adicionar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(UsuarioId usuarioId) {

        usuarioRepository.deleteByIdAndCodSistema(usuarioId.getId(), usuarioId.getCodSistema());

    }

    public Usuario alterar(Usuario usuario) {

        return usuarioRepository.save(usuario);

    }

}
