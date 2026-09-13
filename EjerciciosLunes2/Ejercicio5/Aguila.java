package EjerciciosLunes2.Ejercicio5;

public class Aguila extends Animal implements Volador {
    
    public Aguila(String nombre, int edad) throws EdadInvalidaError{
        super(nombre, edad);
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