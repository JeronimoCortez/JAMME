import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, numberInverted, digits;
        System.out.println("Ingrese un numero entero positivo");
        number = read.nextInt();
        numberInverted = 0;
        while (number != 0) {
            digits = number % 10;
            number = number / 10;
            numberInverted = numberInverted * 10 + digits;
        }

        System.out.println("El numero invertido es " + numberInverted);
    }
}
