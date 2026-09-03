package EjerciciosLunes2.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nombre;
    private List<CuentaBancaria> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void aplicarIntereses() {

        System.out.println(" BANCO " + nombre);

        for (CuentaBancaria cuenta : cuentas) {

            String tipo;

            if (cuenta instanceof CuentaAhorroPremium) {
                tipo = "Cuenta de Ahorros Premium";

            } else if (cuenta instanceof CuentaAhorros) {
                tipo = "Cuenta de Ahorros";

            } else if (cuenta instanceof CuentaCorriente) {
                tipo = "Cuenta Corriente";

            } else {
                tipo = "Cuenta Bancaria";
            }

            double interes = cuenta.calcularInteres();

            cuenta.setSaldo(
                cuenta.getSaldo() + interes
            );

            System.out.println(
                "Cuenta: " +
                cuenta.getNumeroCuenta()
            );

            System.out.println(
                "Tipo: " + tipo
            );

            System.out.println(
                "Interés generado: $" +
                interes
            );

            System.out.println(
                "Nuevo saldo: $" +
                cuenta.getSaldo()
            );
        }
    }
}