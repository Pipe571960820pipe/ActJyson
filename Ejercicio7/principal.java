package EJERPOOY.Ejercicio7;
/*
Ejercicio 7: Gestión de una cuenta bancaria mediante clases y objetos.
Diseñar e implementar una clase CuentaBancaria que aplique encapsulamiento (atributos
privados titular y saldo), constructor para inicializar valores, y métodos públicos depositar, retirar
(validando fondos suficientes) y consultarSaldo. Crear una clase ejecutable con el método main que
instancie un objeto y pruebe las operaciones.
*/
import javax.swing.JOptionPane;
public class principal {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Andrés Felipe", 100000);

        JOptionPane.showMessageDialog(null, "Titular: " + cuenta.getTitular());
        JOptionPane.showMessageDialog(null, "Saldo inicial: $" + cuenta.consultarSaldo());

        cuenta.depositar(50000);
        JOptionPane.showMessageDialog(null, "Saldo actual: $" + cuenta.consultarSaldo());

        cuenta.retirar(30000);
        JOptionPane.showMessageDialog(null, "Saldo actual: $" + cuenta.consultarSaldo());

        cuenta.retirar(500000);
        JOptionPane.showMessageDialog(null, "Saldo final: $" + cuenta.consultarSaldo());

    }
}
