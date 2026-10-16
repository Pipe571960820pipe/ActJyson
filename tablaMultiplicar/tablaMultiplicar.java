package EJERPOOY;

import javax.swing.JOptionPane;

public class tablaMultiplicar {
    public static void main(String[] args) {
        int numero, pares, resultado;
        String tabla;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero:"));
        pares = 0;
        tabla = "Tabla de multiplicar del " + numero + "\n";

        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            tabla += numero + " x " + i + " = " + resultado + "\n";

            if (resultado % 2 == 0) {
                pares++;
            }
        }

        tabla += "\nCantidad de resultados pares: " + pares;

        JOptionPane.showMessageDialog(null, tabla);
    }
}
