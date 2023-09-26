import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int number, exp, digits;
        double binary;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Introduce un numero entero >= 0: ");
            number = sc.nextInt();
        }while(number < 0);

        exp=0;
        binary=0;
        while(number!=0){
            digits = number % 2;
            binary = binary + digits * Math.pow(10, exp);
            exp++;
            number = number/2;
        }
        System.out.printf("Binario: %.0f %n", binary);
    }
}
