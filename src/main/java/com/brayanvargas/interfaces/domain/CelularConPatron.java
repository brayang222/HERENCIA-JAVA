package com.brayanvargas.interfaces.domain;

public class CelularConPatron extends CelularBasico implements Desbloqueable{
    public CelularConPatron(String marca, Persona propietario) {
        super(marca, propietario);
    }

    @Override
    public boolean desbloquear(Persona p) {
        if (p.getPatron().equals(this.getPropietario().getPatron())){
            return true;
        } else {
            return super.desbloquear(p);
        }
    }

}
