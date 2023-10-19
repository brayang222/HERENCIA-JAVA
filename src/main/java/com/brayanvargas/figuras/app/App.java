package com.brayanvargas.figuras.app;

import com.brayanvargas.figuras.domain.Circulo;
import com.brayanvargas.figuras.domain.Cuadrado;
import com.brayanvargas.figuras.domain.FiguraGeometrica;
import com.brayanvargas.figuras.domain.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class App {
   public static void main(String[] args) {

      List<FiguraGeometrica> figuras = new ArrayList<>();
      Circulo circulo = new Circulo();
      Triangulo triangulo = new Triangulo();
      Cuadrado cuadrado = new Cuadrado();

      figuras.add(circulo);
      figuras.add(triangulo);
      figuras.add(cuadrado);

      if (cuadrado instanceof FiguraGeometrica){
         System.out.println("El cuadraro es una figura geométrica");
      } else {
         System.out.println("El cuadraro no es una figura geométrica");
      }

      if (triangulo instanceof FiguraGeometrica){
         System.out.println("El triangulo es una figura geométrica");
      } else {
         System.out.println("El triangulo no es una figura geométrica");
      }

      if (cuadrado instanceof FiguraGeometrica){
         System.out.println("El cuadrado es una figura geométrica");
      } else {
         System.out.println("El cuadrado no es una figura geométrica");
      }

   }
}
