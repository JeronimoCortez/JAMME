import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un numero");
        number = read.nextInt();
        System.out.println("Tabla de " + number);
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + i * number);
        }
    }
}
