package EjerciciosLunes2.Ejercicio4;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("Banco Nacional");

        CuentaAhorros cuentaAhorros = new CuentaAhorros(
                        1000000,
                        "AH001"
                );

        CuentaAhorroPremium cuentaPremium = new CuentaAhorroPremium(
                        2000000,
                        "AP001"
                );

        CuentaCorriente cuentaCorriente = new CuentaCorriente(
                        1500000,
                        "CO001"
                );

        banco.agregarCuenta(cuentaAhorros);
        banco.agregarCuenta(cuentaPremium);
        banco.agregarCuenta(cuentaCorriente);

        banco.aplicarIntereses();
    }
}