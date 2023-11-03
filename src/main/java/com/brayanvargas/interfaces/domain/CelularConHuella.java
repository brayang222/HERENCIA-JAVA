package com.brayanvargas.interfaces.domain;

public class CelularConHuella extends CelularBasico implements Desbloqueable{

    public CelularConHuella(String marca, Persona propietario) {
        super(marca, propietario);
    }

    @Override
    public boolean desbloquear(Persona p) {
        if (p.getHuella().equals(this.getPropietario().getHuella())){
            return true;
        } else {
            return super.desbloquear(p);
        }
    }
}
