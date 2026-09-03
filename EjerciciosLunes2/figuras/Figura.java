package EjerciciosLunes2.figuras;

public class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        throw new UnsupportedOperationException(
            "El método calcularArea() debe ser sobrescrito."
        );
    }

    public String describir() {
        return "Figura: " + nombre +
               " - Área: " + calcularArea();
    }
}