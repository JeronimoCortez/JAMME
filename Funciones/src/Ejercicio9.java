import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un numero entero: ");
        number = read.nextInt();
        calculateFactorial(number);
    }

    public static void calculateFactorial(int number){
        int factorial;
        factorial = 1;
        if(number == 0){
            factorial = 1;
        }else if(number != 0){
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
        }
        System.out.println("El factorial de " + number + " es " + factorial);
    }
}
