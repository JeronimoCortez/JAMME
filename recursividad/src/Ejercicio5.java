import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int numero;
        Scanner read = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero");
            numero =  read.nextInt();
        }while(numero < 0);
        System.out.println("La suma desde 1 hasta " + numero + " es: " + sumarNumeros(numero));
    }
    public static int sumarNumeros(int numero){
        if (numero == 1){
            return 1;
        }else{
            return numero + sumarNumeros(numero - 1);
        }
    }
}
