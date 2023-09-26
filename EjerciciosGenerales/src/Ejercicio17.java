import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, digits , aux, digit;
        System.out.println("Ingrese un numero");
        number = read.nextInt();
        aux = number;
        digits = 0;
        while(aux != 0){
            aux = aux / 10;
            digits++;
        }

        for (int i = digits - 1; i >=  0 ; i--) {
            digit = number / (int) Math.pow(10, i);
            System.out.print(digit + " ");
            number = number % (int) Math.pow(10, i);
        }
    }
}
