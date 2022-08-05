package com.megatec.backendmegatec.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.megatec.classesId.UsuarioId;

@Entity
@IdClass(UsuarioId.class)
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    // #region atributos
    @EmbeddedId
    private UsuarioId usuarioId;

    @Id
    @Column(nullable = false, updatable = false, insertable = false)
    private Integer id;

    @Id
    @Column(nullable = false, updatable = false, insertable = false)
    private Integer codEmpresa;

    @Id
    private String cpfUsuario;

    private String nomeUsuario;

    private String emailUsuario;

    private String senhaUsuario;
    // #endregion

    // #region get and set

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(UsuarioId usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(Integer codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    // #endregion get and set

}
