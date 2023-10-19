package com.brayanvargas.appdomain;

public class Vehiculo {
   private String matricula;
   private String marca;
   private  String modelo;
   private short anio;
   private String color;

   public void acelerar(){
      System.out.println("Acelerando...");
   }

   public void frenar(){
      System.out.println("Frenando...");
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
