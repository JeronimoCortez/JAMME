import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String text;
        String wordMostLarge = "";
        String [] words;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        text = read.nextLine();
        words = text.split(" ");
        for(String word : words){
            if (word.length() > wordMostLarge.length() ){
                wordMostLarge = word;
            }
        }
        System.out.println("La palabra mas larga del texto es '" + wordMostLarge +"'");
    }
}
