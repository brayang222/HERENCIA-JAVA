package com.brayanvargas.app;

import com.brayanvargas.appdomain.*;

import java.util.ArrayList;
import java.util.List;

public class App {
   public static void main(String[] args) {

      List<Vehiculo> vehiculos = new ArrayList<>();
      Vehiculo vehiculo1 = new Vehiculo();
      Taxi taxi = new Taxi();
      Bicicleta bicicleta = new Bicicleta();
      BicicletaMontana mtb = new BicicletaMontana();
      BicicletaRuta rutera = new BicicletaRuta();

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
            System.out.println("Es una bicicleta");
         } else {
            System.out.println("No es ningún vehículo conocido");
         }
      }
   }
}
