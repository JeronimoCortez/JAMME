import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        int cont;
        cont = 0;
        do{
            System.out.println("Ingrese un numero, para salir ingrese un numero negativo");
            number = read.nextInt();
            if(number % 10 == 2){
                cont ++;
            }
        }while (number > 0);
        System.out.println("La cantidad de numeros terminados en 2 es: " + cont);
    }
}
