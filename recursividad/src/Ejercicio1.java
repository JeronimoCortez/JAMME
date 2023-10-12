import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int dividendo, divisor;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        dividendo = read.nextInt();
        System.out.println("Ingrese el divisor");
        divisor = read.nextInt();
        System.out.println("El cociente de la division es " + calcularCociente(dividendo,divisor));
    }

    public static int calcularCociente(int dividendo, int divisor) {
        int cociente = 0;
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        if (dividendo >= divisor) {
            dividendo = dividendo - divisor;
            cociente = 1 + calcularCociente(dividendo, divisor);
        }
        return cociente;
    }
}