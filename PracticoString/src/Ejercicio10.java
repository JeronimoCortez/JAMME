import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        String texto, palabra;
        char letra;
        int maxConsonantes = 0;
        String [] palabras;
        String palabraConMasConsonantes = "";
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        texto =  read.nextLine();
        palabras = texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            int consonantesSeguidas = 0;
            palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                letra = palabra.charAt(j);
                if (!esVocal(letra)){
                    consonantesSeguidas++;
                }
            }
            if (consonantesSeguidas > maxConsonantes){
                palabraConMasConsonantes = palabra;
            }
        }
        System.out.println("La palabra con mas consonantes seguidas es '" + palabraConMasConsonantes + "'");
    }
    public static boolean esVocal(char letra){
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U';
    }
}
