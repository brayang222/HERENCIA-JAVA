package com.brayanvargas.persona.app;

import com.brayanvargas.figuras.domain.FiguraGeometrica;
import com.brayanvargas.persona.domain.Estudiante;
import com.brayanvargas.persona.domain.Persona;
import com.brayanvargas.persona.domain.Profesor;

import java.util.ArrayList;
import java.util.List;

public class App {
   public static void main(String[] args) {

      List<Persona> personas = new ArrayList<>();
      Profesor profesor = new Profesor();
      Estudiante estudiante = new Estudiante();

      personas.add(profesor);
      personas.add(estudiante);



      if (profesor instanceof Persona){
         System.out.println("El profesor es una figura geométrica");
      } else {
         System.out.println("El profesor no es una figura geométrica");
      }

      if (estudiante instanceof Persona){
         System.out.println("El estudiante es una figura geométrica");
      } else {
         System.out.println("El estudiante no es una figura geométrica");
      }

   }
}
