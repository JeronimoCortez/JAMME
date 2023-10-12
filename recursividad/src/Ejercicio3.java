import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        int numero;
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero");
            numero = read.nextInt();
        }while(numero < 0);
        System.out.println("2 ^ " + numero + " es " + potencia(numero));
    }
    public static double potencia(int numero){
        if (numero == 0) {
            return 1;
        }else{
            return 2 * potencia(numero - 1);
        }
    }
}
