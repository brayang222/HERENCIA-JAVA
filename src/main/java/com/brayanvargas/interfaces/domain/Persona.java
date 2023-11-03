package com.brayanvargas.interfaces.domain;

public class Persona {
    private String nombre;
    private String rostro;
    private String huella;
    private String patron;
    private short pin;

    public Persona(String nombre, String rostro, String huella, String patron, short pin) {
        this.nombre = nombre;
        this.rostro = rostro;
        this.huella = huella;
        this.patron = patron;
        this.pin = pin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRostro() {
        return rostro;
    }

    public String getHuella() {
        return huella;
    }

    public String getPatron() {
        return patron;
    }

    public short getPin() {
        return pin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRostro(String rostro) {
        this.rostro = rostro;
    }

    public void setHuella(String huella) {
        this.huella = huella;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public void setPin(short pin) {
        this.pin = pin;
    }
}
