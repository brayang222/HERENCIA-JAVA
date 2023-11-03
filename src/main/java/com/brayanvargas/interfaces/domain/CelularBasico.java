package com.brayanvargas.interfaces.domain;

public class CelularBasico extends Celular implements Desbloqueable {

    public CelularBasico(String marca, Persona propietario) {
        super(marca, propietario);
    }

    @Override
    public boolean desbloquear(Persona p) {
        return p.getPin() == this.getPropietario().getPin();
    }
}
