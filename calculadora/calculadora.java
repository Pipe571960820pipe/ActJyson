package EJERPOOY.calculadora;
/*
• Ejercicio 4: Calculadora básica con selección múltiple.
Presentar un menú con cuatro operaciones aritméticas básicas
1. Suma
2. Resta,
3. Multiplicación,
4. División.
Leer dos números y ejecutar la opción seleccionada validando la división por cero.
*/
import javax.swing.JOptionPane;

public class calculadora {
    public static void main(String[] args) {
        double num1, num2, resultado;
        int opcion;

        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\nDigite la opcion:"));
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero 1:"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero 2:"));

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    JOptionPane.showMessageDialog(null, "La resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: " + resultado);
                    break;
                case 4:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
                    } else {
                        resultado = num1 / num2;
                        JOptionPane.showMessageDialog(null, "La division es: " + resultado);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no existe");
            }
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Debe digitar solo numeros");
        }
    }
}
