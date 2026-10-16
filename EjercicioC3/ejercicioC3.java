package EJERPOOY;

import javax.swing.JOptionPane;

/*
BLOQUE 2: EJERCICIOS DE ESTRUCTURAS CONDICIONALES
• Ejercicio 3: Determinación de paridad y signo de un número.
Leer un número entero y determinar mediante estructuras condicionales anidadas si el
número es par o impar, y simultáneamente si es positivo, negativo o cero.
*/
public class ejercicioC3 {
    public static void main(String[] args) {
        double numero;

        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero: "));

        if (numero == 0) {
            JOptionPane.showMessageDialog(null, "El numero es 0");

        } else if (numero % 2 == 0) {
            if (numero >= 0) {
                JOptionPane.showMessageDialog(null, "El numero es par y el positivo");

            } else if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El numero es par, pero es negativo");
            }
        } else {
            if (numero >= 0) {
                JOptionPane.showMessageDialog(null, "El numero es impar y es positivo");
            } else if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El numero es impar y es negativo");

            }
        }
    }
}
