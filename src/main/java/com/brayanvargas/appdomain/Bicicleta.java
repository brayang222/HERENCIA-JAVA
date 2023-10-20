package com.brayanvargas.appdomain;

public class Bicicleta extends Vehiculo{
   private byte nroPiniones;
   private double tamanoRueda;
   private String tipoRueda;
   private String tipoFreno;

   public Bicicleta(String marca, String modelo, short anio, String tipoFreno) {
      super(marca, modelo, anio);
      this.tipoFreno = tipoFreno;
   }


   public byte getNroPiniones() {
      return nroPiniones;
   }

   public void setNroPiniones(byte nroPiniones) {
      this.nroPiniones = nroPiniones;
   }

   public double getTamanoRueda() {
      return tamanoRueda;
   }

   public String getTipoFreno() {
      return tipoFreno;
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

   public void setTipoFreno(String tipoFreno) {
      this.tipoFreno = tipoFreno;
   }
}
