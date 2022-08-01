package com.megatec.backendmegatec.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.megatec.backendmegatec.model.Usuario;

@Repository
public class UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private Integer ultId = 0;

    /**
     * Retorna lista de Usuario
     * 
     * @return lista de protudos
     */
    public List<Usuario> obterTodos() {
        return usuarios;
    }

    /**
     * Optional para nao retornar erro caso retorne
     * Retornar Usuario por id
     * 
     * @param id chave do prod
     * @return um Usuario caso seja encontrado
     */
    public Optional<Usuario> obterPorId(Integer id) {
        return usuarios.stream().filter(usuario -> usuario.getId() == id).findFirst();

    }

    /**
     * 
     * 
     */
    public Usuario adicionar(Usuario usuario) {
        ultId++;
        usuario.setId(ultId);
        usuarios.add(usuario);

        return usuario;
    }

    /**
     * 
     * 
     */
    public void deletar(Integer id) {
        usuarios.removeIf(usuario -> usuario.getId() == id);

    }

    public Usuario alterar(Usuario usuario) {

        Optional<Usuario> usuarioEncontrado = obterPorId(usuario.getId());

        if (usuarioEncontrado.isEmpty()) {
            throw new InputMismatchException("usuario não encontrado");
        }

        deletar(usuario.getId());

        usuarios.add(usuario);

        return usuario;
    }

}
