package com.megatec.classesid;

import java.io.Serializable;

public class UsuarioId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer codEmpresa;

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

    public UsuarioId() {
    }

    public UsuarioId(Integer id, Integer codEmpresa) {
        this.id = id;
        this.codEmpresa = codEmpresa;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codEmpresa == null) ? 0 : codEmpresa.hashCode());
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
        UsuarioId other = (UsuarioId) obj;
        if (codEmpresa == null) {
            if (other.codEmpresa != null)
                return false;
        } else if (!codEmpresa.equals(other.codEmpresa))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
