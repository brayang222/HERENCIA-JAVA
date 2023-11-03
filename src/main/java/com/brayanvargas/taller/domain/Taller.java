package com.brayanvargas.taller.domain;

import java.util.ArrayList;
import java.util.List;

public class Taller {
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Taller() {
        this.vehiculos = new ArrayList<>();
    }

    public void ingresar(Vehiculo vehiculoAIngresar){
        boolean existe = vehiculos.stream() //stream convierte en una matriz
                .filter(vehiculo -> vehiculo.getMatricula() ==
                        vehiculoAIngresar.getMatricula()).findAny().isPresent();

        if (!existe){
            this.vehiculos.add(vehiculoAIngresar);
            System.out.println("Se ingresó el vehiculo");
        } else {
            System.out.println("El vehiculo ya existe");
        }
    }

    public boolean reparar(Vehiculo vehiculoAReparar){
        if (vehiculoAReparar instanceof Reparable){
            ((Reparable) vehiculoAReparar).reparar();
            return true;
        }
        return false;
    }

    public List<Vehiculo> listar(){
        return this.vehiculos;
    }

}
