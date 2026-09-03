package EjerciciosLunes2.Ejercicio4;

public class CuentaAhorroPremium extends CuentaAhorros {

    public CuentaAhorroPremium(
            double saldo,
            String numeroCuenta) {

        super(saldo, numeroCuenta);
    }

    @Override
    public double calcularInteres() {

        return getSaldo() * 0.07;
    }
}