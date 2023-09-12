import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number1, number2, number3, mayor;
        System.out.println("Ingrese un numero");
        number1 = read.nextInt();
        System.out.println("Ingrese el segundo numero");
        number2 = read.nextInt();
        System.out.println("Ingrese el tercer numero");
        number3 = read.nextInt();
        mayor = number1;
        if (number1 < number2 && number2 > number3){
            mayor = number2;
        }else if(number1 < number3 && number3 > number2){
            mayor = number3;
        }
        System.out.println("El numero mayor es: " + mayor);
    }
}
