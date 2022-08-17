package com.megatec.classesid;

import java.io.Serializable;

public class UsuarioId implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cpfUsuario;
    private Integer codEmpresa;

    // public Integer getId() {
    // return id;
    // }

    // public void setId(Integer id) {
    // this.id = id;
    // }

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

    public UsuarioId() {
    }

    public UsuarioId(String cpfUsuario, Integer codEmpresa) {
        // this.id = id;
        this.cpfUsuario = cpfUsuario;
        this.codEmpresa = codEmpresa;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codEmpresa == null) ? 0 : codEmpresa.hashCode());
        // result = prime * result + ((cpfUsuario == null) ? 0 : cpfUsuario.hashCode());
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
        UsuarioId other = (UsuarioId) obj;
        if (codEmpresa == null) {
            if (other.codEmpresa != null)
                return false;
        } else if (!codEmpresa.equals(other.codEmpresa))
            return false;
        if (cpfUsuario == null) {
            if (other.cpfUsuario != null)
                return false;
        } else if (!cpfUsuario.equals(other.cpfUsuario))
            return false;
        return true;
    }

}
