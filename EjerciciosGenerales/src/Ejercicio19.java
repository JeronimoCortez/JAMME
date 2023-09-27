//Mayor de N números

/*Programa que pide al usuario que introduzca números enteros que pueden ser
positivos o negativos. La lectura de números por teclado finaliza cuando se
introduce un cero. El programa mostrará el mayor de todos los números
introducidos.*/

import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, max;
        number = 1;
        max = 0;
        while (number != 0) {
            System.out.println("Ingrese un numero");
            number = read.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println("El mayor numero ingresado es: " + max);
    }
}
