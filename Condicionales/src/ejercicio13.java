import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int year;
        System.out.println("Ingrese un año");
        year = read.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("El año " + year + " es bisiesto");
        } else{
            System.out.println("El año " + year + " no es bisiesto");
        }
    }
}
