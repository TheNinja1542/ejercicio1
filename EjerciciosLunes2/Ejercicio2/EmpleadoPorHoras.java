package EjerciciosLunes2.Ejercicio2;

public class EmpleadoPorHoras extends Empleado {

    private double pagoPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(
            String nombre,
            double pagoPorHora,
            int horasTrabajadas) {

        super(nombre, pagoPorHora);

        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPago() {
        return pagoPorHora * horasTrabajadas;
    }
}