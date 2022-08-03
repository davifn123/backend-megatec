package com.megatec.backendmegatec.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

    // #region atributos

    @Id
    private String cpf;

    private String nome;

    private String email;

    private String password;

    // #endregion

    // #region get and set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // #endregion get and set

}
