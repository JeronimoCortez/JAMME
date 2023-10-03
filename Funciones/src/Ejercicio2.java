import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un numero");
        number = read.nextInt();
        countNumerals(number);
    }

    public static void countNumerals(int number){
        int numerals, aux;
        aux = number;
        numerals = 0;
        while(number != 0){
            number = number / 10;
            numerals++;
        }
        System.out.println("El numero " + aux + " tiene " + numerals + " cifras");
    }
}
