import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero;
        Scanner read = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero");
            numero =  read.nextInt();
        }while(numero < 0);
        System.out.println("Binario");
        decimalABinario(numero);

    }
    public static void decimalABinario(int numero){
        if (numero < 2){
            System.out.println(numero);
        }else{
            decimalABinario(numero/2);
            System.out.println(numero % 2);
        }

    }
}
