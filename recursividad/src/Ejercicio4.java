import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero;
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("Inrese un numero");
            numero = read.nextInt();
        }while(numero < 0);
        System.out.println("El numero de cifras del numero es " + contadorCifras(numero));
    }
    public static int contadorCifras(int numero){
        if(numero < 10){
            return 1;
        }else{
            return 1 + contadorCifras(numero / 10);
        }
    }
}
