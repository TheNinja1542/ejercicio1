package EjerciciosLunes.Colegio;

public class Estudiante {

    int codigo;
    String nombre;
    int edad;
    double promedio;
    Estudiante siguiente;

    public Estudiante(int codigo, String nombre, int edad, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.siguiente = null;
    }
    public void Mostrar() {

        System.out.println(
                codigo + " - " +
                        nombre + " - " +
                        edad + " años - " +
                        promedio
        );
    }
}

