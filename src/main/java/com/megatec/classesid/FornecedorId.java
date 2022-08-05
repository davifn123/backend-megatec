package com.megatec.classesId;

import java.io.Serializable;

public class FornecedorId implements Serializable {

    private static final long serialVersionUID = 1L;

    // @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String cnpj_fornecedor;

    public String getCnpj_fornecedor() {
        return cnpj_fornecedor;
    }

    public void setCnpj_fornecedor(String cnpj_fornecedor) {
        this.cnpj_fornecedor = cnpj_fornecedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FornecedorId(Integer id, String cnpj_fornecedor) {
        this.id = id;
        this.cnpj_fornecedor = cnpj_fornecedor;
    }

    public FornecedorId() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FornecedorId other = (FornecedorId) obj;
        if (cnpj_fornecedor == null) {
            if (other.cnpj_fornecedor != null)
                return false;
        } else if (!cnpj_fornecedor.equals(other.cnpj_fornecedor))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
