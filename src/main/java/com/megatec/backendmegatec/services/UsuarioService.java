package com.megatec.backendmegatec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megatec.backendmegatec.model.Usuario;
import com.megatec.backendmegatec.repository.UsuarioRepository;
import com.megatec.classesId.UsuarioId;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obterTodos() {
        // regra de negocio caso tenha
        return usuarioRepository.findAll();
    }

    public Usuario obterPorId(UsuarioId usuarioId) {

        return usuarioRepository.findByIdAndCodEmpresa(usuarioId.getId(), usuarioId.getCodEmpresa());

    }

    // public Usuario obterPorNome(Usuario usuario) {
    // return usuarioRepository.findByNome_Usuario(usuario.getNome_usuario());
    // }

    public Usuario findByCpf(Usuario usuario) {

        return usuarioRepository.findById(usuario.getCpfUsuario());

    }

    public Usuario adicionar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(UsuarioId usuarioId) {

        usuarioRepository.deleteByIdAndCodEmpresa(usuarioId.getId(), usuarioId.getCodEmpresa());

    }

    public Usuario alterar(Usuario usuario) {

        return usuarioRepository.save(usuario);

    }

}
