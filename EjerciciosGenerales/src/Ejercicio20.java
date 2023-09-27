/*Cifra mayor de un número versión 1

Programa que calcule la cifra mayor de un número y la posición que ocupa.
Se considera la posición 1 la de más a la derecha. Si la cifra mayor se repite
varias veces en el número se indicará la posición de la que se encuentre
más a la izquierda.
Por ejemplo, si leemos el número N = 49982
el programa mostrará:
Cifra mayor: 9 Posición: 4*/

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        int num, posicionMayor, cifra, mayor, posicion;
        Scanner read = new Scanner(System.in);

        do {
            System.out.print("Introduce un numero entero: ");
            num = read.nextInt();
        } while (num <= 0);
        mayor = 0;
        posicionMayor = 0;
        posicion = 0;
        while (num != 0) {
            posicion++;
            cifra = num % 10;
            if (cifra >= mayor) {
                mayor = cifra;
                posicionMayor = posicion;
            }
            num = num / 10;
        }
        System.out.print("Cifra mayor: " + mayor);
        System.out.println("Posición: " + posicionMayor);
    }
}
