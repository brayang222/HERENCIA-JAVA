package com.brayanvargas.appdomain;

public final class Taxi extends Vehiculo {
   private String registroCirculacion;
   private String empresa;
   private byte numPasajeros;

   public Taxi(String marca, String modelo, short anio) {
      super(marca, modelo, anio);
   }

   @Override
   public void acelerar() {
      System.out.println("acelero diferente, más lento");
   }

   public String getRegistroCirculacion() {
      return registroCirculacion;
   }

   public String getEmpresa() {
      return empresa;
   }

   public byte getNumPasajeros() {
      return numPasajeros;
   }

   public void setRegistroCirculacion(String registroCirculacion) {
      this.registroCirculacion = registroCirculacion;
   }

   public void setEmpresa(String empresa) {
      this.empresa = empresa;
   }

   public void setNumPasajeros(byte numPasajeros) {
      this.numPasajeros = numPasajeros;
   }
}

