package com.brayanvargas.dispositivo.app;

import com.brayanvargas.dispositivo.domain.Celular;
import com.brayanvargas.dispositivo.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class App {
   public static void main(String[] args) {
      List<Celular> celulars = new ArrayList<>();
      Smartphone smartphone = new Smartphone();

      celulars.add(smartphone);

      if (smartphone instanceof Celular) {
         System.out.println("Es un celular");
      } else {
         System.out.println("No es un celular");
      }

   }
}
