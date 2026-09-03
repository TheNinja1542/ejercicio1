package EjerciciosLunes.Alcantarillado;
import java.util.Random;

class alcantarillado {

    private int numero;
    private int[] consumo;

    public alcantarillado(int numero) {
        this.numero = numero;
        this.consumo = new int[3];
        generarConsumo();
    }
    private void generarConsumo() {
        Random randon = new Random();
        for (int i = 0; i < consumo.length; i++) {
            consumo[i] = randon.nextInt(26);
        }
    }
    public void verificarExceso(int limite) {
        for (int i = 0; i < consumo.length; i++) {
            if (consumo[i] > limite) {
                int excedente = consumo[i] - limite;

                System.out.println("Familia " + numero +
                        " - Mes " + (i + 1) +
                        " - Consumo: " + consumo[i] +
                        " - Excedido: " + excedente + " mil litros");
            }
        }
    }
    public void mostrarConsumo() {
        System.out.print("Familia " + numero + " : ");
        for (int c : consumo) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}