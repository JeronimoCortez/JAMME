import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, sum1, sum2;
        System.out.println("Ingrese cuantas cifras de fibonacci desea ver:");
        number = read.nextInt();
        fibonacci(number);
    }
    public static void fibonacci(int number){
        int sum1, sum2;
        sum1 = 1;
        sum2 = 1;
        System.out.print(sum1 + " ");
        for (int i = 2; i <= number; i++) {
            System.out.print(sum2 + " ");
            sum2 = sum1 + sum2;
            sum1 = sum2 - sum1;
        }
    }
}
