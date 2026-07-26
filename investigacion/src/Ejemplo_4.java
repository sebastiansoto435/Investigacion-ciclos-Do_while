import javax.swing.*;

public class Ejemplo_4 {
    public static void main(String[] args) {
        /*El programa tiene un número secreto ,pide al usuario que lo adivine ,el programa sigue solicitando números hasta que el usuario acierte.*/

        int secreto = 25;
        int intento;

        do {
            intento = Integer.parseInt(JOptionPane.showInputDialog("Adivine el número: "));

            if (intento != secreto) {
                System.out.println("Número incorrecto.");
            }

        } while (intento != secreto);

        System.out.println("¡Felicidades! Adivinaste el número.");
    }
}
