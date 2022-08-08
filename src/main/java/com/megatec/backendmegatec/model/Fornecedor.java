package com.megatec.backendmegatec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
// @IdClass(FornecedorId.class)
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;

    // #region atributos

    // @EmbeddedId
    // private FornecedorId fornecedorId;

    // @Id
    // @Column(insertable = false, updatable = false)
    // private Integer id;

    @Id
    // @Column(insertable = false, updatable = false)
    private String cnpj_fornecedor;

    private String nome_fornecedor;

    private String email_fornecedor;

    private String fone_fornecedor;
    // #endregion atributos

    // #region get and set

    // public FornecedorId getFornecedorId() {
    // return fornecedorId;
    // }

    // public void setFornecedorId(FornecedorId fornecedorId) {
    // this.fornecedorId = fornecedorId;
    // }

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public String getEmail_fornecedor() {
        return email_fornecedor;
    }

    public void setEmail_fornecedor(String email_fornecedor) {
        this.email_fornecedor = email_fornecedor;
    }

    public String getFone_fornecedor() {
        return fone_fornecedor;
    }

    public void setFone_fornecedor(String fone_fornecedor) {
        this.fone_fornecedor = fone_fornecedor;
    }

    public String getCnpj_fornecedor() {
        return cnpj_fornecedor;
    }

    public void setCnpj_fornecedor(String cnpj_fornecedor) {
        this.cnpj_fornecedor = cnpj_fornecedor;
    }

    // #endregion get and set

}
