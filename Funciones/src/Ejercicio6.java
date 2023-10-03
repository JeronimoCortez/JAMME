import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un numero entero positivo");
        number = read.nextInt();
        reverseNumber(number);
    }
    public static void reverseNumber(int number){
        int numberInverted, digits;
        numberInverted = 0;
        while (number != 0) {
            digits = number % 10;
            number = number / 10;
            numberInverted = numberInverted * 10 + digits;
        }

        System.out.println("El numero invertido es " + numberInverted);
    }
}
