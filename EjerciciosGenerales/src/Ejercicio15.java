import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, factorial;
        System.out.println("Ingrese un numero entero: ");
        number = read.nextInt();
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
