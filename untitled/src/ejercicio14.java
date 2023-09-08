import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un numero");
        number = read.nextInt();
        if(number >= 100 && number <= 999){
            if(number / 100 == (number % 10)){
                System.out.println("El numero " + number + " es capicua");
            }else {
                System.out.println("El numero " + number + " no es capicua");
            }
        }else{
            System.out.println("El numero " + number + " no es de 3 cifras");
        }

    }
}
