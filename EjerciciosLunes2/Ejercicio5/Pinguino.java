package EjerciciosLunes2.Ejercicio5;

public class Pinguino extends Animal {

    public Pinguino(
            String nombre,
            int edad) throws EdadInvalidaError {

        super(nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "Graznido";
    }
}