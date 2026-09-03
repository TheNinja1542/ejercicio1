package EjerciciosLunes2.Ejercicio2;

public class Empleado {

    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularPago() {
        throw new UnsupportedOperationException(
            "El método calcularPago() debe ser sobrescrito."
        );
    }

    public String getNombre() {
        return nombre;
    }
}