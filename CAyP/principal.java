package EJERPOOY.CAyP;
/*• Ejercicio 1: Cálculo del área y perímetro de un rectángulo.
Diseñar un algoritmo que solicite al usuario la base y la altura de un rectángulo calcule su área
y su perímetro, e imprima los resultados.
 */

import javax.swing.JOptionPane;

public class principal {
    public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo: "));

        Rectangulo rect = new Rectangulo(base, altura);

        JOptionPane.showMessageDialog(null,
                "El área del rectángulo es: " + rect.calcularArea()
                + "\nEl perímetro del rectángulo es: " + rect.calcularPerimetro());
    }
}
