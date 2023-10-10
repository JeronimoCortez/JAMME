import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        String texto;
        String fraseMasLarga = "";
        String [] frases;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un texto, separe las frases con .");
        texto = read.nextLine();
        frases = texto.split("\\.");
        for (String frase : frases) {
            String[] palabras = frase.trim().split(" ");
            if (palabras.length > fraseMasLarga.split(" ").length) {
                fraseMasLarga = frase.trim();
            }
        }
        System.out.println("La frase con mas palabras es '" + fraseMasLarga + "'");
    }
}
