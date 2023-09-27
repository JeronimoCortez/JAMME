/*Cifra mayor de un número versión 2

Programa que calcule la cifra mayor de un número y la posición que ocupa.
Se considera la posición 1 la de más a la izquierda. Si la cifra mayor se
repite varias veces en el número se indicará la posición de la que se
encuentre más a la izquierda.
Por ejemplo, si leemos el número N = 75271
el programa mostrará:
Cifra mayor: 7 Posición: 1*/

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        int num, aux, posicionMayor, cifra, mayor, posicion, numCifras;
        Scanner read= new Scanner(System.in);

        do {
            System.out.print("Introduce numero entero >0: ");
            num = read.nextInt();
        } while (num <= 0);
        aux = num;
        numCifras = 0;
        while (aux != 0) {
            numCifras++;
            aux = aux / 10;
        }
        mayor = 0;
        posicionMayor = 0;
        posicion = 0;
        for(int i = numCifras-1; i >= 0; i--){
            posicion++;
            cifra = num / (int)Math.pow(10, i);
            if (cifra > mayor) {
                mayor = cifra;
                posicionMayor = posicion;
            }
            num = num % (int)Math.pow(10, i);
        }
        System.out.print("Cifra mayor: " + mayor);
        System.out.println(" Posición: " + posicionMayor);
    }
}
