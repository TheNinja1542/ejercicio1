package EjerciciosHerencia.Ejercicio2.Vehiculos;

public abstract class Vehiculo {

    protected String nombre;
    protected double peso;
    protected double potencia;

    public Vehiculo(String nombre, double peso, double potencia) {
        this.nombre = nombre;
        this.peso = peso;
        this.potencia = potencia;
    }

    public abstract double velocidadMaxima();

    public void mostrar() {
        System.out.println("Vehiculo: " + nombre);
        System.out.println("Velocidad maxima: " + velocidadMaxima());
    }
}
