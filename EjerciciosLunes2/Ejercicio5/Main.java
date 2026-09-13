package EjerciciosLunes2.Ejercicio5;


public class Main {

    public static void main(String[] args) {

        System.out.println("Ejercicio 5");

        try {

            Zoologico zoologico = new Zoologico("Zoológico Nacional");

            Leon leon = new Leon("Simba",5);

            Pinguino pinguino = new Pinguino("Pipo",3 );

            Aguila aguila = new Aguila("Águila Real",2 );

            zoologico.agregarAnimal(leon);
            zoologico.agregarAnimal(pinguino);
            zoologico.agregarAnimal(aguila);

            System.out.println(leon.getNombre()+ ": " + leon.hacerSonido() );

            System.out.println(pinguino.getNombre()+ ": "+ pinguino.hacerSonido() );

            System.out.println(aguila.getNombre()+ ": "+ aguila.hacerSonido());


            zoologico.mostrarAnimalesVoladores();

        } catch (EdadInvalidaError e) {

            System.out.println("Error: " + e.getMessage() );
        }
    }
}