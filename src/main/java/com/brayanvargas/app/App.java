package com.brayanvargas.app;

import com.brayanvargas.appdomain.*;

import java.util.ArrayList;
import java.util.List;

public class App {
   public static void main(String[] args) {

      List<Vehiculo> vehiculos = new ArrayList<>();
      Vehiculo vehiculo1 = new Vehiculo("Mazda", "rx7", (short) 2001);
      Taxi taxi = new Taxi("Toyota", "Corolla", (short) 1995);
      Bicicleta bicicleta = new Bicicleta("JW", "pirana", (short) 2017, "brembo");
      BicicletaMontana mtb = new BicicletaMontana("Mountain bike", "terrain", (short) 2022, "Brembo", "Showa");
      BicicletaRuta rutera = new BicicletaRuta("Giro", "italic", (short) 2023, "Brembo");

      vehiculos.add(taxi);
      vehiculos.add(bicicleta);
      vehiculos.add(mtb);
      vehiculos.add(rutera);

      vehiculo1 = mtb;

      ((BicicletaMontana)vehiculo1).setTipoSuspension("Monobrazo");

      taxi.setColor("morado");

      imprimirTiposDeVehiculos(vehiculos);
   }



   public static void imprimirTiposDeVehiculos(List<Vehiculo> vehiculos) {
      for (Vehiculo vehiculo : vehiculos) {
         if (vehiculo instanceof Taxi) {
            System.out.println("Es un taxi");
         } else if (vehiculo instanceof Bicicleta) {
            System.out.println(vehiculo + "Es una bicicleta");
         } else {
            System.out.println("No es ningún vehículo conocido");
         }
      }
   }
}
