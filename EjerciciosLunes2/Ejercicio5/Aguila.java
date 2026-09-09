package EjerciciosLunes2.Ejercicio5;

public class Aguila extends Animal implements Volador {
    private double envergaduraAlas;

    public Aguila( String nombre,int edad,double envergaduraAlas) throws EdadInvalidaError {
                 super(nombre, edad);
                 this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    public String hacerSonido() {
        return "¡Chillido de águila!";
    }

    @Override
    public String volar() {
        return getNombre() + " está volando.";
    }
}