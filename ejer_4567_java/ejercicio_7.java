import javax.swing.*;

public class ejercicio_7 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null, "Ingresa una frase terminada en un punto: ");
        frase = frase.trim();
        int cont = 0;
        if(frase.endsWith(".")){
            String nuevaFrase = frase.substring(0, frase.length() - 1);
            String[] palabras = nuevaFrase.split(" ");
            for (String palabra : palabras){
                if(palabra.endsWith("a") || palabra.endsWith("e") || palabra.endsWith("i") || palabra.endsWith("o") || palabra.endsWith("u")){
                    cont++;
                }
            }
            JOptionPane.showMessageDialog(null, "Hay " + cont + " palabras que terminan en una vocal.");
        }
        else{
            JOptionPane.showMessageDialog(null, "La frase que ingresaste no termina en un punto.");
        }
    }
}
