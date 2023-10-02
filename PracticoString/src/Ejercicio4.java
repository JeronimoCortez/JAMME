import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String phrase;
        System.out.println("Ingrese una frase");
        phrase = read.nextLine();
        countA(phrase);
    }

    public static void countA(String phrase){
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i) == 'a' || phrase.charAt(i) == 'A'){
                count++;
            }
        }
        System.out.println("La cantidad de letras a que hay en la frase es: " + count);
    }
}
