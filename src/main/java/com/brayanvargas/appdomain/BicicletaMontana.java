package com.brayanvargas.appdomain;

public class BicicletaMontana extends Bicicleta{
   private String tipoSuspension;

   public BicicletaMontana(String marca, String modelo, short anio, String tipoFreno, String tipoSuspension) {
      super(marca, modelo, anio, tipoFreno);
      this.tipoSuspension = tipoSuspension;
   }

   public String getTipoSuspension() {
      return tipoSuspension;
   }

   public void setTipoSuspension(String tipoSuspension) {
      this.tipoSuspension = tipoSuspension;
   }
}
