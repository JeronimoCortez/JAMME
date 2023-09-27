/*Programa Java que compruebe si un número es narcisista.
Se considera que un número es narcisista si la suma de sus cifras elevadas
al número de cifras que tiene el número es igual al propio número.
Por ejemplo, el número 153 es un número narcisista. El número tiene 3 cifras
y si sumamos cada una de sus cifras elevada al cubo el resultado es el propio número:
13 + 53 + 33 -> 1 + 125 + 27 -> 153
Otro ejemplo de número narcisista es el 1634
14 + 64 + 34 + 44 -> 1 + 1296 + 81 + 256 -> 1634
El programa pedirá que se introduzca por teclado un número entero positivo
y determinará si es un número narcisista o no lo es.*/

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N, aux, cifra, numeroCifras = 0;
        double suma;
        do {
            System.out.print("Introduce número entero positivo: ");
            N = read.nextInt();
            if (N <= 0) {
                System.out.println("Error. Debe ser un número positivo");
            }
        } while (N <= 0);
        aux = N;
        while (aux != 0) {
            numeroCifras++;
            aux /= 10;
        }
        suma = 0;
        aux = N;
        while (aux != 0) {
            cifra = aux % 10;
            suma = suma + Math.pow(cifra, numeroCifras);
            aux /= 10;
        }

        if (suma == N) {
            System.out.println("Es narcisista");
        } else {
            System.out.println("No es narcisista");
        }
    }
}
