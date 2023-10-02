import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        String [] utiles = {"Goma", "Lapiz", "Cuaderno"};
        double [] precios = {20.5, 30.2, 100.23, 12.5};

        for (int i = 0; i < 3; i++) {
            System.out.println(utiles[i]);
            System.out.println(precios[i]);
        }
        for (int i = 0; i < utiles.length; i++) {
            System.out.println(utiles[i]);
        }
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
        */
        //int [] number1 = new int[5];
        //loadArray(number1);
        //displayArray(number1);
        //averageNumber(number1);
        final int row = 2;
        final int col = 2;
        int [][] matriz = new int[row][col];
        loadMatriz(matriz, row, col);
        displayMatriz(matriz);
    }
    public static void loadArray(int [] number1){
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < number1.length; i++) {
            System.out.println("Ingrese un numero entero");
            int number = read.nextInt();
            number1[i] = number;
        }
    }

    public static void displayArray(int [] number1){
        System.out.println("Los valores del arreglo son:");
        for (int i = 0; i < number1.length; i++) {
            System.out.print(number1[i] + " ");
        }
        System.out.println("");
    }

    public static void averageNumber(int [] number1){
        int store = 0;
        for (int i = 0; i < number1.length; i++) {
            store = store + number1[i];
        }
        store = store / number1.length;
        System.out.println("El promedio de los numeros ingresados es: " + store);
    }

    public static void loadMatriz(int [][] matriz, int row,int col){
        int number;
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Ingrese el valor de la fila " + i + " columna " + j);
                number = read.nextInt();
                matriz[i][j] = number;
            }

        }
    }

    public static void displayMatriz(int [][] matriz){
        System.out.println("Los valores de la matriz son: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}