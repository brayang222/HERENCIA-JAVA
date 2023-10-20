package com.brayanvargas.appdomain;

public final class BicicletaMontana extends Bicicleta{
   private String tipoSuspension;

   public BicicletaMontana(String marca, String modelo, short anio, String tipoFreno, String tipoSuspension) {
      super(marca, modelo, anio, tipoFreno);
      this.tipoSuspension = tipoSuspension;
   }

   @Override
   public void acelerar() {
      System.out.println("Acelero picando una rueda");
   }

   public String getTipoSuspension() {
      return tipoSuspension;
   }

   public void setTipoSuspension(String tipoSuspension) {
      this.tipoSuspension = tipoSuspension;
   }
}
