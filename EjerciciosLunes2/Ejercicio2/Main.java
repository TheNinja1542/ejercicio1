package EjerciciosLunes2.Ejercicio2;

public class Main {

    public static void main(String[] args) {

        GeneradorNomina nomina =
                new GeneradorNomina();

        EmpleadoTiempoCompleto empleado1 =
                new EmpleadoTiempoCompleto(
                        "Carlos",
                        3000000
                );

        EmpleadoPorHoras empleado2 =
                new EmpleadoPorHoras(
                        "Ana",
                        20000,
                        80
                );

        nomina.agregarEmpleado(empleado1);
        nomina.agregarEmpleado(empleado2);

        nomina.mostrarNomina();
    }
}