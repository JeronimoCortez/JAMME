import javax.swing.*;

public class ejercicio_6 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null,"Ingresa una frase: ");
        frase = frase.trim();
        if(frase.endsWith(".")){
            String[] palabras = frase.split("\\s+");
            int cantPalabras = palabras.length;
            JOptionPane.showMessageDialog(null, "La frase tiene " + cantPalabras + " palabras.");
        }else{
            JOptionPane.showMessageDialog(null, "La frase no termina en un punto.");
        }
    }
}
