package EJERPOOY.temperatura;
/*
• Ejercicio 2: Conversión de temperatura de Celsius a Fahrenheit.
Solicitar la temperatura en grados Celsius y convertirla a grados Fahrenheit utilizando la
fórmula correcta. Utilizar constantes explicativas.

 */
import javax.swing.JOptionPane;

public class principal {
    public static void main(String[] args) {

        double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite la temperatura que desea convertir: "));

        temperatura pipe = new temperatura(temperatura);
        JOptionPane.showMessageDialog(null, "La temperatura convertida es: " + pipe.CalcularT());

    }
}
