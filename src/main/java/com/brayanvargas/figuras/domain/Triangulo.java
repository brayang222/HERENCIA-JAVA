package com.brayanvargas.figuras.domain;

public class Triangulo extends FiguraGeometrica{
   private short numLados;

   @Override
   public double calcularArea() {
      return 0;
   }

   @Override
   public double calcularPerimetro() {
      return 0;
   }

   public short getNumLados() {
      return numLados;
   }

   public void setNumLados(short numLados) {
      this.numLados = numLados;
   }
}
