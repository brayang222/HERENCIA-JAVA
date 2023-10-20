package com.brayanvargas.figuras.domain;

public class Cuadrado extends FiguraGeometrica {
   private int base;
   private int altura;

   public Cuadrado(int base, int altura) {
      this.base = base;
      this.altura = altura;
   }

   @Override
   public double calcularArea() {
      return base * altura;
   }

   @Override
   public double calcularPerimetro() {
      return 2 * (base + altura);
   }

   public int getBase() {
      return base;
   }

   public void setBase(int base) {
      this.base = base;
   }

   @Override
   public double getAltura() {
      return altura;
   }

   public void setAltura(int altura) {
      this.altura = altura;
   }
}
