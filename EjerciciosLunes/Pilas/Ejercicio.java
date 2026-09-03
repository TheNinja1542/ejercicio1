package EjerciciosLunes.Pilas;

import javax.swing.JOptionPane;

public class Ejercicio {
    public static void main(String[] args) {

        byte max = 4, op = 0;
        int tope = -1, i;
        byte Pila[] = new byte[5];

        while (op != 6) {
            op = Byte.parseByte(JOptionPane.showInputDialog("""
                    Digite un numero
                    1.Insertar
                    2.Eliminar
                    3.Mostrar
                    4.Invertir pila
                    5.Mostrar invertida
                    6.Salir"""));

            byte invertida[] = new byte[5];
            int topeInv = -1;
            switch (op) {
                case 1 -> {
                    if (tope != max) {
                        tope++;
                        Pila[tope] = Byte.parseByte(JOptionPane.showInputDialog("Digite valor"));
                    } else {
                        JOptionPane.showMessageDialog(null, "Overflow");
                    }
                }
                case 2 -> {
                    if (tope != -1) {
                        tope--;
                    } else {
                        JOptionPane.showMessageDialog(null, "Underflow");
                    }
                }
                case 3 -> {
                    if (tope != -1) {
                        for (i = tope; i >= 0; i--) {
                            JOptionPane.showMessageDialog(null, Pila[i]);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila vacia");
                    }
                }
                case 4 -> {
                    if (tope != -1) {
                        byte aux[] = new byte[5];
                        int topeAux = -1;

                        for (i = 0; i <= tope; i++) {
                            topeAux++;
                            aux[topeAux] = Pila[i];
                        }
                        for (i = topeAux; i >= 0; i--) {
                            topeInv++;
                            invertida[topeInv] = aux[i];
                        }
                        JOptionPane.showMessageDialog(null, "Pila invertida creada");
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila vacia");
                    }
                }
                case 5 -> {
                    if (tope != -1) {
                        byte aux[] = new byte[5];
                        int topeAux = -1;
                        for (i = 0; i <= tope; i++) {
                            topeAux++;
                            aux[topeAux] = Pila[i];
                        }
                        for (i = topeAux; i >= 0; i--) {
                            topeInv++;
                            invertida[topeInv] = aux[i];
                        }
                        for (i = topeInv; i >= 0; i--) {
                            JOptionPane.showMessageDialog(null, invertida[i]);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila vacia");
                    }
                }
                case 6 -> JOptionPane.showMessageDialog(null, "Gracias");
            }
        }
    }
}