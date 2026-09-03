package EjerciciosLunes2.Ejercicio3.Inventario;

import java.util.ArrayList;
import java.util.List;

import EjerciciosLunes2.Ejercicio3.Vehiculo;

public class Concesionaria {

    private String nombre;
    private List<Vehiculo> vehiculos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void mostrarReporte() {

        System.out.println(
            "===== CONCESIONARIA " +
            nombre +
            " ====="
        );

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }
    }
}