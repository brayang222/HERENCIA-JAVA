package com.brayanvargas.appdomain;

public class Taxi extends Vehiculo {
   private String registroCirculacion;
   private String empresa;
   private byte numPasajeros;

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

