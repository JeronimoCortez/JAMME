import javax.swing.*;

public class ejercicio_5 {
    public static void main(String[] args) {
        char letra;
        int cont = 0;
        String frase = JOptionPane.showInputDialog(null, "Ingresa una frase: ");
        frase = frase.toLowerCase();
        for(int i = 0; i < frase.length(); i++){
            letra = frase.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de vocales en el texto es de " + cont + ".");
    }
}
