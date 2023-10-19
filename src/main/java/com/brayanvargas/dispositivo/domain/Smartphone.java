package com.brayanvargas.dispositivo.domain;

public class Smartphone extends Celular {
   private String nombreDuenio;
   private short numCamaras;
   private short numBloqueo;

   public String getNombreDuenio() {
      return nombreDuenio;
   }

   public short getNumCamaras() {
      return numCamaras;
   }

   public short getNumBloqueo() {
      return numBloqueo;
   }

   public void setNombreDuenio(String nombreDuenio) {
      this.nombreDuenio = nombreDuenio;
   }

   public void setNumBloqueo(short numBloqueo) {
      this.numBloqueo = numBloqueo;
   }
}
