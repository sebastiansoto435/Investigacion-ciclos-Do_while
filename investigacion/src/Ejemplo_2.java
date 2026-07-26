import javax.swing.*;

public class Ejemplo_2 {
    public static void main(String[] args) {
        /*Solicita al usuario que ingrese números enteros. El programa debe ir sumándolos y terminar cuando el usuario ingrese 0. Al final, muestra la suma total*/
        int numero;
        int suma = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero(0 para terminar)"));
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma total es: " + suma);

    }
}
