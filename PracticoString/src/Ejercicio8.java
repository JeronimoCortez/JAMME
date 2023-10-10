import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        String text;
        String[] arrayText;
        String word;
        char lastLetter;
        int count_vocals = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        text = read.nextLine();
        arrayText = text.split(" ");
        for (int i = 0; i < arrayText.length; i++) {
            word = arrayText[i];
            lastLetter = word.charAt(word.length() - 1);
            if (lastLetter == 'A' || lastLetter == 'E' || lastLetter == 'I' || lastLetter == 'O' || lastLetter == 'U' ||
                    lastLetter == 'a' || lastLetter == 'e' || lastLetter == 'i' || lastLetter == 'o' || lastLetter == 'u') {
                count_vocals++;
            }
        }
        System.out.println("La cantidad de palabras que terminan en vocal es " + count_vocals);
    }
}
