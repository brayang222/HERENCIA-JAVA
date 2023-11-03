package com.brayanvargas.taller.domain;

public class Carro extends Vehiculo implements Reparable{

    public Carro(int matricula, String marca, boolean bueno) {
        super(matricula, marca, bueno);
    }



    @Override
    public boolean reparar() {
        return true;
    }
}
