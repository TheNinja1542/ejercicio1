package EjerciciosLunes2.Ejercicio5;

public class Aguila extends Animal implements Volador {
    private double enbelgaduraAlas;

    public Aguila( String nombre,int edad, double enbelgaduraAlas) throws EdadInvalidaError {
        super(nombre, edad);
        this.enbelgaduraAlas = enbelgaduraAlas;
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