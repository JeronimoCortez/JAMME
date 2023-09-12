import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int variableA;
        int variableB;
        int aux;
        System.out.println("Ingrese el valor de la variable A");
        variableA = read.nextInt();
        System.out.println("Ingrese el valor de la variable B");
        variableB = read.nextInt();
        aux = variableA;
        variableA = variableB;
        variableB = aux;
        System.out.println("Los valores intercambiados serian" +
                            "\nvariable A = " + variableA +
                            "\nvariable B = " + variableB );
    }
}
