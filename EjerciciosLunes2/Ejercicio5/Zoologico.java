package EjerciciosLunes2.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    private String nombre;
    private List<Animal> animales;

    public Zoologico(String nombre) {
        this.nombre = nombre;
        animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarAnimalesVoladores() {

        System.out.println("Animales Voladores");

        for (Animal animal : animales) {

            if (animal instanceof Volador) {

                Volador volador =
                    (Volador) animal;

                System.out.println(volador.volar());
            }
        }
    }
}