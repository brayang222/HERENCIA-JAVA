package com.brayanvargas.persona.domain;

public class Persona {
   private int numeroIdentificacion;
   private short altura;
   private short edad;
   private String nombre;

   public void caminar(){
      System.out.println("Esta caminando..");
   }

   public void comer(){
      System.out.println("Esta comiendo");
   }

   public void dormir(){
      System.out.println("Descansando");
   }

   public int getNumeroIdentificacion() {
      return numeroIdentificacion;
   }

   public short getAltura() {
      return altura;
   }

   public short getEdad() {
      return edad;
   }

   public String getNombre() {
      return nombre;
   }

   public void setAltura(short altura) {
      this.altura = altura;
   }

   public void setEdad(short edad) {
      this.edad = edad;
   }


}
