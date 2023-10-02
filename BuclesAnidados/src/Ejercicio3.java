import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        double factorial, sum = 0;

        do{
            System.out.println("Ingrese un numero no negativo");
            number = read.nextInt();
        }while(number < 0);

        if(number > 0) {
            for (int i = 1; i <= number; i++) {
                factorial = 1;
                for (int j = 1; j <= i; j++) {
                    factorial = factorial * j;
                }
                sum = sum + factorial;
                System.out.printf("El factorial de " + i + " es " + (int)factorial + "\n");
            }
            System.out.printf("La suma de todos los factoriales es: " + (int)sum + "\n");
        }else{
            System.out.println("El factorial de 0 es 1");
        }
    }
}
