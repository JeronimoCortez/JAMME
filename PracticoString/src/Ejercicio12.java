import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        String texto;
        String fraseMasLarga = "";
        String palabraMasCorta;
        String [] frases;
        String [] palabras;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un texto, separe las frases con .");
        texto = read.nextLine();
        frases = texto.split("\\.");
        for (String frase : frases) {
            palabras = frase.trim().split(" ");
            if (palabras.length > fraseMasLarga.split(" ").length) {
                fraseMasLarga = frase.trim();
            }
        }
        palabras = fraseMasLarga.trim().split(" ");
        palabraMasCorta = palabras[0];
        for (String palabra : palabras){
            if(palabra.length() < palabraMasCorta.length()){
                palabraMasCorta = palabra;
            }
        }
        System.out.println("La frase mas larga es: '" + fraseMasLarga + "' y la palabra mas corta de la frase es: '" + palabraMasCorta + "'");
    }
}
