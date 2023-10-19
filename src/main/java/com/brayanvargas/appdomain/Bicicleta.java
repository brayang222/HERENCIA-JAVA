package com.brayanvargas.appdomain;

public class Bicicleta extends Vehiculo{
   private byte nroPiniones;
   private double tamanoRueda;
   private String tipoRueda;

   public byte getNroPiniones() {
      return nroPiniones;
   }

   public void setNroPiniones(byte nroPiniones) {
      this.nroPiniones = nroPiniones;
   }

   public double getTamanoRueda() {
      return tamanoRueda;
   }

   public void setTamanoRueda(double tamanoRueda) {
      this.tamanoRueda = tamanoRueda;
   }

   public String getTipoRueda() {
      return tipoRueda;
   }

   public void setTipoRueda(String tipoRueda) {
      this.tipoRueda = tipoRueda;
   }
}
