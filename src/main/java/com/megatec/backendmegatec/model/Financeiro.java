package com.megatec.backendmegatec.model;

import javax.persistence.Entity;

@Entity
public class Financeiro {

    private Double entradas;

    private Double saidas;

    public Double getEntradas() {
        return entradas;
    }

    public void setEntradas(Double entradas) {
        this.entradas = entradas;
    }

    public Double getSaidas() {
        return saidas;
    }

    public void setSaidas(Double saidas) {
        this.saidas = saidas;
    }

}
