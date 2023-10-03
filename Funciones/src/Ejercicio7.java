import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un numero");
        number = read.nextInt();
        perfectNumber(number);
    }

    public static void perfectNumber(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number){
            System.out.println("El numero es perfecto");
        }else{
            System.out.println("El numero no es perfecto");
        }
    }
}
