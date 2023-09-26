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
        int [] number1 = new int[5];
        loadArray(number1);
        displayArray(number1);
        averageNumber(number1);
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
}