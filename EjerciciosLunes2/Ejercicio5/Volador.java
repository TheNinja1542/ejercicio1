package EjerciciosLunes2.Ejercicio5;

public interface Volador {

    default String volar() {
        return "El animal está volando.";
    }
}