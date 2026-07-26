import javax.swing.*;

public class Ejemplo_5 {
    public static void main(String[] args) {
        /*Solicita al usuario que ingrese notas (de 0 a 5). El programa debe seguir pidiendo notas hasta que el usuario ingrese -1. Al finalizar, muestra el promedio de las notas ingresadas*/

        double nota;
        double suma = 0;
        int cantidad = 0;

        do {
            System.out.print("Ingrese una nota (-1 para terminar): ");
            nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota(-1 para terminar): )"));

            if (nota != -1) {
                suma += nota;
                cantidad++;
            }

        } while (nota != -1);

        if (cantidad > 0) {
            double promedio = suma / cantidad;
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }

    }
}
