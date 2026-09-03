package EjerciciosLunes.Colegio;

import java.util.Scanner;

public class ListaEstudiante {

    public static void main(String[] args) {

        byte op = 0;
        Estudiante cabeza = null;
        Estudiante cola = null;

        Scanner entrada = new Scanner(System.in);

        while (op != 6) {

            System.out.println("""
                    
                    Ingrese una opcion:
                    1. Agregar estudiante
                    2. Eliminar estudiante
                    3. Buscar estudiante
                    4. Mostrar estudiantes
                    5. Mostrar estudiante con mayor promedio
                    6. Salir
                    """);
            op = entrada.nextByte();
            switch (op) {
                case 1:
                    System.out.println("Ingresar codigo: ");
                    int codigo = entrada.nextInt();
                    System.out.println("Ingresar nombre: ");
                    String nombre = entrada.next();
                    System.out.println("Ingresar edad: ");
                    int edad = entrada.nextInt();
                    System.out.println("Ingresar promedio: ");
                    double promedio = entrada.nextDouble();

                    Estudiante nuevo = new Estudiante(
                            codigo,
                            nombre,
                            edad,
                            promedio
                    );
                    if (cabeza == null) {
                        cabeza = nuevo;
                        cola = nuevo;
                    } else {
                        cola.siguiente = nuevo;
                        cola = nuevo;
                    }
                    System.out.println("Estudiante agregado correctamente");
                    break;
                case 2:
                    if (cabeza == null) {
                        System.out.println("Lista vacia");
                    } else {
                        System.out.println("Ingrese el codigo del estudiante: ");
                        codigo = entrada.nextInt();

                        if (cabeza.codigo == codigo) {
                            cabeza = cabeza.siguiente;
                            if (cabeza == null) {
                                cola = null;
                            }
                            System.out.println("Estudiante eliminado");
                        } else {
                            Estudiante actual = cabeza;
                            while (actual.siguiente != null &&
                                    actual.siguiente.codigo != codigo) {
                                actual = actual.siguiente;
                            }
                            if (actual.siguiente == null) {
                                System.out.println("Estudiante no encontrado");
                            } else {
                                actual.siguiente = actual.siguiente.siguiente;
                                if (actual.siguiente == null) {
                                    cola = actual;
                                }
                                System.out.println("Estudiante eliminado");
                            }
                        }
                    }
                    break;
                case 3:

                    if (cabeza == null) {
                        System.out.println("Lista vacia");
                    } else {
                        System.out.println("Ingrese el codigo del estudiante: ");
                        codigo = entrada.nextInt();
                        Estudiante actual = cabeza;

                        while (actual != null &&
                                actual.codigo != codigo) {
                            actual = actual.siguiente;
                        }
                        if (actual != null) {
                            System.out.println("Estudiante encontrado:");
                            actual.Mostrar();
                        } else {
                            System.out.println("Estudiante no encontrado");
                        }
                    }
                    break;
                case 4:
                    if (cabeza != null) {

                        System.out.println("ESTUDIANTES:");

                        Estudiante actual = cabeza;

                        while (actual != null) {

                            actual.Mostrar();
                            actual = actual.siguiente;
                        }
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 5:
                    if (cabeza == null) {
                        System.out.println("Lista vacia");
                    } else {
                        Estudiante mayor = cabeza;
                        Estudiante actual = cabeza.siguiente;

                        while (actual != null) {
                            if (actual.promedio > mayor.promedio) {
                                mayor = actual;
                            }
                            actual = actual.siguiente;
                        }
                        System.out.println("Estudiante con mayor promedio:");
                        mayor.Mostrar();
                    }
                    break;
                case 6:
                    System.out.println("Hasta la vista bby");

                    break;
            }
        }
    entrada.close();
    }
}
