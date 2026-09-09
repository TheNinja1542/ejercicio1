package EjerciciosLunes2.Ejercicio5;

public class Leon extends Animal {

    public Leon(String nombre,int edad) throws EdadInvalidaError {
        super(nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "Roooar";
    }
}