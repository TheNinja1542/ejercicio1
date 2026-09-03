package EjerciciosHerencia.Ejercicio2.Vehiculos;

public class VehiculoTerrestre extends Vehiculo{
    public VehiculoTerrestre(String nombre, double peso, double potencia){
        super(nombre, peso, potencia);
    }
    @Override
    public double velocidadMaxima (){
        return potencia - peso;
    }
    public double consumo(){
        return 10;
    }
}
    

