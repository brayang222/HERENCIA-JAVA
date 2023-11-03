package com.brayanvargas.taller.domain;

public abstract class Vehiculo {
    protected int matricula;
    protected String marca;
    protected boolean bueno;

    public Vehiculo(int matricula, String marca, boolean bueno) {
        this.matricula = matricula;
        this.marca = marca;
        this.bueno = bueno;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula=" + matricula +
                ", marca='" + marca + '\'' +
                ", bueno=" + bueno +
                '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isBueno() {
        return bueno;
    }
}
