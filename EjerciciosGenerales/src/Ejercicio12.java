import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el texto a cifrar");
        String text = read.next();
        System.out.println("Ingrese el valor de desplazamiento");
        int n = read.nextInt();
        System.out.println("Deseas cifras(C) o descifrar(D)");
        char option = read.next().charAt(0);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length() ; i++) {
            char character = text.charAt(i);
            if (Character.isUpperCase(character)) {
                char cifrado = (char) ('A' + ((character - 'A' + (option == 'C' ? n : 26 - n)) % 26));
                result.append(cifrado);
            } else if (Character.isLowerCase(character)) {
                char cifrado = (char) ('a' + ((character - 'a' + (option == 'C' ? n : 26 - n)) % 26));
                result.append(cifrado);
            } else {
                result.append(character);
            }
        }

        System.out.println("Texto " + (option == 'C' ? "cifrado" : "descifrado") + ": " + result.toString());

    }
}
