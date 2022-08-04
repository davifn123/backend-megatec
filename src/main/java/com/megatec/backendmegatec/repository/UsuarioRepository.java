package com.megatec.backendmegatec.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megatec.backendmegatec.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query("SELECT u from Usuario u "
            + " where u.usuarioId.id = :id"
            + " and u.usuarioId.codSistema = :codSistema")
    Usuario findByIdAndCodSistema(Integer id, Integer codSistema);

    @Query("SELECT u from Usuario u "
            + " where like u.nome_usuario = :nome_usuario")
    Usuario findByNomeUsuario(String nome_usuario);

    @Query("SELECT u from Usuario u "
            + "where like u.cpf_usuario = :cpf_usuario")
    Usuario findByCpf(String cpf_usuario);

    @Query("DELETE from Usuario u"
            + " where u.usuarioId.id = :id"
            + " and u.usuarioId.codEmpresa = :codEmpresa")
    Usuario deleteByIdAndCodSistema(Integer id, Integer codSistema);
}