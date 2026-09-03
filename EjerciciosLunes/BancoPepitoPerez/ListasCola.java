package EjerciciosLunes.BancoPepitoPerez;

import java.util.Scanner;

public class ListasCola {
    public static void main(String[] args) {
        byte Max = 4, op = 0;
        int cabeza = -1, cola = -1;
        int NextTurno = 1;
        Cliente[] Cola = new Cliente[5];
        Scanner entrada = new Scanner(System.in);

        while(op != 6){
            System.out.println("""
                    Ingrese una opcion:
                    1.Agregar cliente
                    2.Atender  cliente
                    3.Mostrar el siguiente cliente
                    4.Mostrar todos los clientes
                    5.Numero de clientes
                    6.salir""");
            op = entrada.nextByte();

            switch (op) {
                case 1:
                    if (cola != Max) {
                        if (cabeza == -1) {
                            cola++;
                            cabeza++;
                        } else {
                            cola++;
                        }
                        System.out.println("Ingresar nombre: ");
                        String nombre = entrada.next();
                        System.out.println("Tipo de tramite: ");
                        String tramite = entrada.next();
                        Cola[cola] = new Cliente(NextTurno, nombre, tramite);
                        NextTurno++;
                        System.out.println("Cliente ingresado a la fila");
                    } else {
                        System.out.println("Fila llena");
                    }
                    break;
                case 2:
                    if (cola != -1) {
                        if (cola == cabeza) {
                            cola = -1;
                            cabeza = -1;
                        } else {
                            cabeza++;
                        }
                    } else {
                        System.out.println("Fila vacia");
                    }
                    break;
                case 3:
                    if (cabeza != -1) {
                        System.out.println("Siguiente cliente:");
                        Cola[cabeza].Mostrar();
                    } else {
                        System.out.println("Fila vacia");
                    }
                    break;
                case 4:
                    if (cabeza != -1){
                        System.out.println("Clientes esperando: ");
                        for(int i = cabeza; i<=cola; i++ ){
                            Cola[i].Mostrar();
                        }
                    }else{
                        System.out.println("La fila esta vacia");
                    }
                    break;
                case 5:
                    if(cabeza==-1){
                        System.out.println("Numero de clientes es: 0");
                    }else{
                        int cantidad = cola + 1;
                        System.out.println("Numero de clientes en la fila: " + cantidad);
                    }
                    break;
                case 6:
                    System.out.println("Gracias por preferir su banco favorito");
            }
        }
    entrada.close();    
    }
}
