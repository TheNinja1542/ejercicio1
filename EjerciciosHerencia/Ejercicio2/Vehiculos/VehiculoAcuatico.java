package EjerciciosHerencia.Ejercicio2.Vehiculos;



public class VehiculoAcuatico extends Vehiculo {

    public VehiculoAcuatico(String nombre, double peso, double potencia) {
        super(nombre, peso, potencia);
    }

    @Override
    public double velocidadMaxima() {
        return potencia - peso / 200;
    }

    public double consumo() {
        return 15;
    }
}