package EjerciciosLunes2.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class GeneradorNomina {

    private List<Empleado> empleados;

    public GeneradorNomina() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public double calcularTotal() {

        double total = 0;

        for (Empleado empleado : empleados) {
            total += empleado.calcularPago();
        }

        return total;
    }

    public void mostrarNomina() {

        System.out.println("===== NÓMINA =====");

        for (Empleado empleado : empleados) {

            System.out.println(
                empleado.getNombre() +
                ": $" +
                empleado.calcularPago()
            );
        }

        System.out.println(
            "Total a pagar: $" +
            calcularTotal()
        );
    }
}