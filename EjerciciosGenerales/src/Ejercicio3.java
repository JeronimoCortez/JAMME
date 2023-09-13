import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String option;
        double degreesCelcius;
        double kelvin;
        do{
            System.out.println("Ingrese los grados celsius");
            degreesCelcius = read.nextDouble();
            kelvin = degreesCelcius + 237;
            System.out.println(degreesCelcius + " grados celsius son " + kelvin + " Kelvin");
            System.out.println("Desea repetir el proceso? ()S/N");
            option = read.next();
        }while(option.equalsIgnoreCase("S"));
    }
}
