/*Cómo calcular la suma de las cifras de un número en Java
Programa Java para obtener la suma de las cifras de un número entero.
El programa leerá por teclado un número entero positivo y
calculará la suma de sus cifras.
Por ejemplo, si se introduce el número 3601 el programa mostrará:
La suma de sus cifras es: 10 */

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int n, suma, cifra;

        do {
            System.out.print("Introduce un número entero positivo: ");
            n = read.nextInt();
            if (n <= 0) {
                System.out.println("Número no válido");
            }
        } while (n <= 0);
        suma = 0;
        while (n != 0) {
            cifra = n % 10;
            suma = suma + cifra;
            n = n / 10;
        }
        System.out.println("La suma de sus cifras es: " + suma);
    }
}
