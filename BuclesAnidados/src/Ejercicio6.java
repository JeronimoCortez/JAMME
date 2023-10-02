import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, i;
        do {
            System.out.print("Introduce un numero > 0: ");
            number = read.nextInt();
        } while (number <= 0);
        System.out.println("Números primos desde 1 hasta " + number);

        for (int j = 2; j <= number; j++) {
            i = 2;
            while (j % i != 0) {
                i++;
            }
            if (i == j) {
                System.out.println(j);
            }
        }
    }
}
