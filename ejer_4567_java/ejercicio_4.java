import javax.swing.*;
import java.util.Scanner;
public class ejercicio_4 {
    public static void main(String[] args) {
        int cont = 0;
        String frase = JOptionPane.showInputDialog(null, "Introduce la frase: ");
        for (int i = 0; i < frase.length(); i++) {
            char letraActual = frase.charAt(i);
            if (letraActual == 'a') {
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de veces que aparece la letra 'a' en la frase es de " + cont + ".");
    }
}
