package com.brayanvargas.figuras.domain;

public abstract class FiguraGeometrica {
   private String color;
   private double altura;
   private double ancho;

   public abstract double calcularArea();
   public abstract double calcularPerimetro();

   @Override
   public String toString() {
      return "FiguraGeometrica{" +
              "color='" + color + '\'' +
              ", altura=" + altura +
              ", ancho=" + ancho +
              '}';
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public double getAltura() {
      return altura;
   }

   public void setAltura(double altura) {
      this.altura = altura;
   }

   public double getAncho() {
      return ancho;
   }

   public void setAncho(double ancho) {
      this.ancho = ancho;
   }
}
