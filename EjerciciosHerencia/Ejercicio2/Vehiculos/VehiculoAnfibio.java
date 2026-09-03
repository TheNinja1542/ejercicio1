package EjerciciosHerencia.Ejercicio2.Vehiculos;

public class VehiculoAnfibio extends Vehiculo{
    private String medio;
    
    public VehiculoAnfibio(String nombre, double peso, double potencia){
        super(nombre, peso, potencia);
        medio = "tierra";
    }
    public void cambiarMedio(String nuevoMedio){
        medio = nuevoMedio;
    }
    @Override
    public double velocidadMaxima(){
        if(medio.equals("tierra")){
            return potencia - peso / 100;
        }else{
            return potencia - peso /200;
        }
    }
    public double consumo(){
        if(medio.equals("tierra")){
            return 10;
        }else{
            return 15;
        }
    }
    public void mostrarMedio(){
        System.out.println("Medio actual: " + medio);
    }
    
}
