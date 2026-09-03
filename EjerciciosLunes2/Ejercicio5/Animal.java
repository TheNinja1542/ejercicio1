package EjerciciosLunes2.Ejercicio5;


public class Animal {

    protected String nombre;
    protected int edad;

    public Animal(
            String nombre,
            int edad) throws EdadInvalidaError {

        if (edad < 0) {
            throw new EdadInvalidaError(
                "La edad del animal no puede ser negativa."
            );
        }

        this.nombre = nombre;
        this.edad = edad;
    }

    public String hacerSonido() {

        throw new UnsupportedOperationException(
            "El método hacerSonido() debe ser sobrescrito."
        );
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}