import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String text;
        String [] cant_word;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        text = read.nextLine();
        cant_word = text.split(" ");
        System.out.println("El texto tiene " + cant_word.length + " palabras");


    }
}
