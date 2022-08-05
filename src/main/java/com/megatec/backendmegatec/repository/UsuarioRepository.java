package com.megatec.backendmegatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.megatec.classesId.UsuarioId;
import com.megatec.backendmegatec.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UsuarioId> {

        @Query("SELECT u from Usuario u "
                        + " where u.usuarioId.id = :id"
                        + " and u.usuarioId.codEmpresa = :codEmpresa")
        Usuario findByIdAndCodEmpresa(Integer id, Integer codEmpresa);

        // @Query("SELECT u from Usuario u "
        // + " where u.nome_usuario = :nome_usuario")
        // Usuario findByNome_Usuario(String nome_usuario);

        @Query("SELECT u from Usuario u "
                        + "where u.cpfUsuario = :cpfUsuario")
        Usuario findById(String cpfUsuario);

        @Query("DELETE from Usuario u "
                        + " where u.usuarioId.id = :id"
                        + " and u.usuarioId.codEmpresa = :codEmpresa")
        Usuario deleteByIdAndCodEmpresa(Integer id, Integer codEmpresa);
}