package EJERPOOY.Ejercicio7;

import javax.swing.JOptionPane;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            JOptionPane.showMessageDialog(null, "Depósito exitoso de $" + monto);
        } else {
            JOptionPane.showMessageDialog(null, "El monto a depositar debe ser mayor que cero.");
                }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            JOptionPane.showMessageDialog(null, "El monto debe ser mayor a 0");
        } else if (monto > saldo) {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes. Saldo disponible: $" + saldo);
        } else {
            saldo = saldo - monto;
            JOptionPane.showMessageDialog(null, "Retiro exitoso de $" + monto);
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
