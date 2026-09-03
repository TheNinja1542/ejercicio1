package EjerciciosLunes2.Ejercicio3;

public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected double velocidadMaxima;

    public Vehiculo(
            String marca,
            String modelo,
            double velocidadMaxima) {

        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {

        return marca + " " +
               modelo +
               " - Velocidad máxima: " +
               velocidadMaxima +
               " km/h";
    }
}