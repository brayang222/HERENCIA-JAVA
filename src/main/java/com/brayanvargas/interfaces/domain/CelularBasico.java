package com.brayanvargas.interfaces.domain;

public class CelularBasico extends Celular implements Desbloqueable {

    @Override
    public boolean desbloquear(Persona p) {
        return p.getPin() == this.getPropietario().getPin();
    }
}
