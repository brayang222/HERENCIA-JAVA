package com.brayanvargas.interfaces.domain;

public class Xiaomi extends CelularBasico implements Desbloqueable{

    @Override
    public boolean desbloquear(Persona p) {
        if (p.getRostro().equals(this.getPropietario().getRostro())){
            return true;
        } else {
            return super.desbloquear(p);
        }
    }
}
