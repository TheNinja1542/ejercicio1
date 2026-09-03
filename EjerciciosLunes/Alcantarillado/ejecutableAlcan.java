package EjerciciosLunes.Alcantarillado;

public class ejecutableAlcan {

    public static void main(String[] args) {

        int limite = 15;

        alcantarillado familia1 = new alcantarillado(1);
        alcantarillado familia2 = new alcantarillado(2);
        alcantarillado familia3 = new alcantarillado(3);

        System.out.println("CONSUMOS GENERADOS:");
        familia1.mostrarConsumo();
        familia2.mostrarConsumo();
        familia3.mostrarConsumo();

        System.out.println("\nFAMILIAS MULTADAS:");
        familia1.verificarExceso(limite);
        familia2.verificarExceso(limite);
        familia3.verificarExceso(limite);
    }
}