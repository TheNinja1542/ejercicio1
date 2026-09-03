package EjerciciosLunes2.figuras;


public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo("Círculo", 5);

        Rectangulo rectangulo =
                new Rectangulo("Rectángulo", 10, 4);

        System.out.println(circulo.describir());
        System.out.println(rectangulo.describir());
    }
}