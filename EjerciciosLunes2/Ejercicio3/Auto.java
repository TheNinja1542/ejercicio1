package EjerciciosLunes2.Ejercicio3;

public class Auto extends Vehiculo {

    private int numeroPuertas;

    public Auto(
            String marca,
            String modelo,
            double velocidadMaxima,
            int numeroPuertas) {

        super(marca, modelo, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {

        return "Auto: " +
               marca + " " +
               modelo +
               " - " +
               velocidadMaxima +
               " km/h - " +
               numeroPuertas +
               " puertas";
    }
}