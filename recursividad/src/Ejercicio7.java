import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int dividendo, divisor;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        dividendo = read.nextInt();
        System.out.println("ingrese el divisor");
        divisor = read.nextInt();
        System.out.println("El resto de la division es: " + calcularResto(dividendo,divisor));
    }
    public static double calcularResto(int dividendo, int divisor){
        if (dividendo < divisor){
            return  dividendo;
        }else{
            return calcularResto(dividendo - divisor, divisor);
        }
    }
}
