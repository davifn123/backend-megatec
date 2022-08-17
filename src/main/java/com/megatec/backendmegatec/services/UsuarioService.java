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

    public Usuario adicionar(Usuario usuario) {

        return usuarioRepository.save(usuario);

    }

    public List<Usuario> obterTodos() {
        // regra de negocio caso tenha
        return usuarioRepository.findAll();
    }

    public Usuario obterPorId(UsuarioId usuarioId) {

        return usuarioRepository.findByIdAndCodEmpresa(usuarioId.getCpfUsuario(), usuarioId.getCodEmpresa());

    }

    // public Usuario obterPorNome(Usuario usuario) {
    // return usuarioRepository.findByNome_Usuario(usuario.getNome_usuario());
    // }

    // public Usuario findByCpf(String cpfUsuario) {

    // return usuarioRepository.findByCpf(cpfUsuario);

    // }

    public void deletar(UsuarioId usuarioId) {
        usuarioRepository.deleteByIdAndCodEmpresa(usuarioId.getCpfUsuario(), usuarioId.getCodEmpresa());
    }

    public Usuario atualizar(Usuario usuario) {

        return usuarioRepository.save(usuario);
    }

}
