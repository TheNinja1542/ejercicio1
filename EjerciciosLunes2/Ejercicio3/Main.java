package EjerciciosLunes2.Ejercicio3;

import EjerciciosLunes2.Ejercicio3.Inventario.Concesionaria;

public class Main {

    public static void main(String[] args) {

        Concesionaria concesionaria =
                new Concesionaria("Autos Colombia");

        Moto moto =
                new Moto(
                        "Yamaha",
                        "MT-07",
                        214,
                        689
                );

        Auto auto =
                new Auto(
                        "Toyota",
                        "Corolla",
                        190,
                        4
                );

        concesionaria.agregarVehiculo(moto);
        concesionaria.agregarVehiculo(auto);

        concesionaria.mostrarReporte();
    }
}