package EjerciciosLunes2.Ejercicio4;

public class CuentaBancaria {

    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(
            double saldo,
            String numeroCuenta) {

        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double calcularInteres() {

        throw new UnsupportedOperationException(
            "El método calcularInteres() debe ser sobrescrito."
        );
    }
}