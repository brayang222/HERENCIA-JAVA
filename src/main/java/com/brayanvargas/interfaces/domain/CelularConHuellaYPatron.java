package com.brayanvargas.interfaces.domain;

public class CelularConHuellaYPatron extends CelularBasico implements Desbloqueable{
    public CelularConHuellaYPatron(String marca, Persona propietario) {
        super(marca, propietario);
    }

    @Override
    public boolean desbloquear(Persona p) {
        if (p.getHuella().equals(this.getPropietario().getHuella()) ||
                p.getPatron().equals(this.getPropietario().getPatron())) {
            return true;
        } else {
            return super.desbloquear(p);
        }
    }
}
