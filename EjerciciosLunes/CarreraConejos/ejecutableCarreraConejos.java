package EjerciciosLunes.CarreraConejos;

public class ejecutableCarreraConejos {
    public static void main(String[] args) {
        conejo[] conejos ={ new conejo("Conejo1"), new conejo("Conejo2")};

        boolean finalista = false;

        while (!finalista){
            for ( conejo c : conejos){
                c.salto();
                if (c.getPocicion() >= 20){
                    System.out.println("Hay un conejo ganador, y es el numero: " + c.getNombre());
                    finalista = true;
                }
            }
        }
    }
}
