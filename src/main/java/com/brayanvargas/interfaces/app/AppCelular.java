package com.brayanvargas.interfaces.app;

import com.brayanvargas.interfaces.domain.*;

public class AppCelular {
    public static void main(String[] args) {
        Persona yesenia = new Persona("Yesenia", "Ovalado", "ABC", "123y", (short) 1234);
        Persona Jennifer = new Persona("Jennifer", "circular", "EFG", "356j", (short) 5678);
        Persona camilo = new Persona("Camilo", "cuadrado", "HIJ", "789c", (short) 9101);

        CelularBasico iphone13 = new CelularConHuella("Iphone 13", yesenia);
        CelularBasico samsungx5 = new CelularConPatron("Samsung x5", Jennifer);
        CelularBasico xiaomi = new CelularConHuellaYPatron("Redmi 12", camilo);

        desbloquearCelular(samsungx5, Jennifer);

    }

    public static void desbloquearCelular(CelularBasico celular, Persona persona){
        boolean desbloqueo = celular.desbloquear(persona);

        if (desbloqueo){
            System.out.println("Desbloqueó " + persona.getNombre() + " " + celular.getMarca());
        } else {
            System.out.println("No se pudo desbloquear " + celular.getMarca());
        }
    }
}
