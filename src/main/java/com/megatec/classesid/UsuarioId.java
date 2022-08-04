package com.megatec.classesId;

import java.io.Serializable;

public class UsuarioId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer codSistema;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodSistema() {
        return codSistema;
    }

    public void setCodSistema(Integer codSistema) {
        this.codSistema = codSistema;
    }

    public UsuarioId() {
    }

    public UsuarioId(Integer id, Integer codSistema) {
        this.id = id;
        this.codSistema = codSistema;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codSistema == null) ? 0 : codSistema.hashCode());
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
        if (codSistema == null) {
            if (other.codSistema != null)
                return false;
        } else if (!codSistema.equals(other.codSistema))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
