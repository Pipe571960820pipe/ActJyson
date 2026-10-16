package EJERPOOY.Ejercicio6;

/*
Leer números mayores o iguales a cero acumulando su suma y contando la cantidad de
lecturas. El ciclo finaliza cuando se ingresa un valor negativo. Al terminar, calcular y mostrar la
suma total y el promedio.
*/
import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {
        double suma = 0;
        int cantidad = 0;
        double numero = 0;
        String ent;

        while (numero >= 0) {
            ent = JOptionPane.showInputDialog("Ingrese un número (n p t):");
            if (ent == null) {

            }

            try {
                numero = Double.parseDouble(ent);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido, intente de nuevo.");
                numero = 0;

            }

            if (numero >= 0) {
                suma = suma + numero;
                cantidad++;
            }
        }

        if (cantidad > 0) {
            double promedio = suma / cantidad;
            JOptionPane.showMessageDialog(null,
                    "Cantidad de lecturas: " + cantidad
                            + "\nSuma total: " + suma
                            + "\nPromedio: " + promedio);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números válidos.");
        }
    }
}
