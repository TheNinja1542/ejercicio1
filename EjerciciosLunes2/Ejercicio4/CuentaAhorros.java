package EjerciciosLunes2.Ejercicio4;

public class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(
            double saldo,
            String numeroCuenta) {

        super(saldo, numeroCuenta);
    }

    @Override
    public double calcularInteres() {

        return getSaldo() * 0.04;
    }
}