package com.brayanvargas.interfaces.domain;

public abstract class Celular implements Activable{

    private String imei;
    private String marca;
    private String modelo;
    private String color;
    private boolean encendido;
    private Persona propietario;

    public Celular(String marca, Persona propietario) {
        this.marca = marca;
        this.propietario = propietario;
    }

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
}
