package EjerciciosHerencia.Ejercicio2.Vehiculos.gestionVehiculos;

import EjerciciosHerencia.Ejercicio2.Vehiculos.VehiculoAcuatico;
import EjerciciosHerencia.Ejercicio2.Vehiculos.VehiculoAereo;
import EjerciciosHerencia.Ejercicio2.Vehiculos.VehiculoAnfibio;
import EjerciciosHerencia.Ejercicio2.Vehiculos.VehiculoTerrestre;

public class App {
    public static void main(String[] args) throws Exception {
        VehiculoTerrestre carro = new VehiculoTerrestre("Carro", 1000, 120);

        VehiculoAcuatico barco = new VehiculoAcuatico("Barco", 2000, 100);

        VehiculoAereo avion = new VehiculoAereo("Avion", 3000, 500);

        VehiculoAnfibio anfibio = new VehiculoAnfibio("Anfibio", 1500, 150);

    

        carro.mostrar();

        System.out.println();

        barco.mostrar();

        System.out.println();

        avion.mostrar();
        avion.desplegar();
        avion.volar();

        System.out.println();

        anfibio.mostrar();
        anfibio.mostrarMedio();
        System.out.println("Consumo: " + anfibio.consumo());

        System.out.println();

        anfibio.cambiarMedio("agua");
        anfibio.mostrarMedio();
        System.out.println("Consumo: " + anfibio.consumo());

        System.out.println();
    }
}
