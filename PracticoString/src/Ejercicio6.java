import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String phrase;
        System.out.println("Ingrese una frase");
        phrase = read.nextLine();
        countVowels(phrase);
    }

    public static void countVowels(String phrase){
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i) == 'a' || phrase.charAt(i) == 'A' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'E'
                || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'I' || phrase.charAt(i) == 'o' || phrase.charAt(i) == 'O'
                    || phrase.charAt(i) == 'u' || phrase.charAt(i) == 'U'){
                count++;
            }
        }
        System.out.println("La cantidad de vocales que hay en la frase es: " + count);
    }
}
