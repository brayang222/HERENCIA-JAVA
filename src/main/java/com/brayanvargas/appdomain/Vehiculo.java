package com.brayanvargas.appdomain;

public class Vehiculo {
   private String matricula;
   private String marca;
   private  String modelo;
   private short anio;
   private String color;

   public Vehiculo(String marca, String modelo, short anio) {
      this.marca = marca;
      this.modelo = modelo;
      this.anio = anio;
   }

   public void acelerar(){
      System.out.println("Acelerando...");
   }

   public void frenar(){
      System.out.println("Frenando...");
   }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String getMatricula() {
      return matricula;
   }

   public String getMarca() {
      return marca;
   }
   public String getModelo() {
      return modelo;
   }

   public short getAnio() {
      return anio;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }
}
