package EjerciciosHerencia.Ejercicio2.Vehiculos;

public class VehiculoAereo extends Vehiculo {

    public VehiculoAereo(String nombre, double peso, double potencia) {
        super(nombre, peso, potencia);
    }

    @Override
    public double velocidadMaxima() {
        return potencia - peso / 300;
    }

    public void desplegar() {
        System.out.println("El vehiculo despego");
    }

    public void volar() {
        System.out.println("vehiculo volando");
    }
}
