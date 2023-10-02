import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String phrase, subsequence;
        int index, indexCharacter, lengthPhrase;
        System.out.println("Ingrese una frase");
        phrase = read.nextLine();
        lengthPhrase = phrase.length();
        System.out.println("La longitud de la frase es: " + lengthPhrase);
        System.out.println("Ingrese el indice que desea obtener");
        index = read.nextInt();
        System.out.println("El caracter que esta en ese indice es: " + phrase.charAt(index));
        System.out.println("Ingrese la frase que desea buscar");
        subsequence = read.next();

            if (phrase.contains(subsequence)){
                System.out.println("La subcadena '" + subsequence + "' esta en la phrase " + phrase);
            }else{
                System.out.println("La subcadena '" + subsequence + "' no esta en la phrase " + phrase);
            }

        System.out.println("Ingrese un caracter que de sea buscar en la frase");
        char character = read.next().charAt(0);
        indexCharacter = phrase.indexOf(character);

        System.out.println("El indice del caracter " + character + " es '" + indexCharacter + "'" );

        System.out.println("La frase transformada en mayusculas: " + phrase.toUpperCase());
    }

}
