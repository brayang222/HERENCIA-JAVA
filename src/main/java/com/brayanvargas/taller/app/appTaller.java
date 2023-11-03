package com.brayanvargas.taller.app;

import com.brayanvargas.taller.domain.Bicicleta;
import com.brayanvargas.taller.domain.Bus;
import com.brayanvargas.taller.domain.Carro;
import com.brayanvargas.taller.domain.Taller;

public class appTaller {
    public static void main(String[] args) {
        Taller autolarte = new Taller();

        Carro carro = new Carro(123, "Mazda", false);
        Bus bus = new Bus(345, "Volvo", false);
        Bicicleta bicicleta = new Bicicleta(111, "Bmx", false);

        autolarte.ingresar(carro);
        autolarte.ingresar(bus);
        autolarte.ingresar(bicicleta);

        System.out.println(autolarte.listar());
    }
}
