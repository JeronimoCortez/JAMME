import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double number1, number2, mayor, menor;
        System.out.println("Ingrese el primer numero");
        number1 = read.nextDouble();
        System.out.println("Ingrese el segundo numero");
        number2 = read.nextDouble();
        if(number1 != number2) {
            if (number2 > number1) {
                mayor = number2;
                menor = number1;
            } else {
                mayor = number1;
                menor = number2;
            }
            if (menor == 0) {
                System.out.println("No se puede dividir por 0");
            } else {
                System.out.println("El resultado de " + mayor + " / " + menor + " = " + mayor / menor);
            }
        }else{
                System.out.println("Los numeros ingresados son iguales");
            }
    }
}
