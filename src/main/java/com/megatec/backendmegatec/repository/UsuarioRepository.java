package com.megatec.backendmegatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.megatec.backendmegatec.model.Usuario;
import com.megatec.classesid.UsuarioId;

public interface UsuarioRepository extends JpaRepository<Usuario, UsuarioId> {

        @Query("SELECT u from Usuario u "
                        + " where u.usuarioId.cpfUsuario = :cpfUsuario"
                        + " and u.usuarioId.codEmpresa = :codEmpresa")
        Usuario findByIdAndCodEmpresa(String cpfUsuario, Integer codEmpresa);

        // @Query("SELECT u from Usuario u "
        // + " where u.nomeUsuario = :nomeUsuario")
        // Usuario findByNomeUsuario(String nomeUsuario);

        // @Query("SELECT u from Usuario u "
        // + "where u.cpfUsuario = :cpfUsuario")
        // Usuario findByCpf(String cpfUsuario);

        @Query("DELETE from Usuario"
                        + " where usuarioId.cpfUsuario = :cpfUsuario"
                        + " and usuarioId.codEmpresa = :codEmpresa")
        Usuario deleteByIdAndCodEmpresa(String cpfUsuario, Integer codEmpresa);
}