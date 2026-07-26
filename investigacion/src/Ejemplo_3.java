import javax.swing.*;

public class Ejemplo_3 {
    public static void main(String[] args) {
        /*Pide al usuario que ingrese números enteros hasta que escriba -1. Al finalizar, muestra cuántos números positivos fueron ingresados*/
        int numero;
        int contador = 0;

        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (-1 para salir): "));

            if (numero > 0) {
                contador++;
            }

        } while (numero != -1);

        System.out.println("Cantidad de números positivos: " + contador);

    }
}
