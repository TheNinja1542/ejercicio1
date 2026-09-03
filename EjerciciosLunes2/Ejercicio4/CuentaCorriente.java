package EjerciciosLunes2.Ejercicio4;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(
            double saldo,
            String numeroCuenta) {

        super(saldo, numeroCuenta);
    }

    @Override
    public double calcularInteres() {

        return getSaldo() * 0.02;
    }
}