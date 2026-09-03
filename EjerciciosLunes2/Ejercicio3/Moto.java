package EjerciciosLunes2.Ejercicio3;

public class Moto extends Vehiculo {

    private int cilindraje;

    public Moto(
            String marca,
            String modelo,
            double velocidadMaxima,
            int cilindraje) {

        super(marca, modelo, velocidadMaxima);
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {

        return "Moto: " +
               marca + " " +
               modelo +
               " - " +
               velocidadMaxima +
               " km/h - " +
               cilindraje +
               " cc";
    }
}