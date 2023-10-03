import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String option;
        double degreesCelcius;
        do{
            System.out.println("Ingrese los grados celsius");
            degreesCelcius = read.nextDouble();
            convertedCelsius(degreesCelcius);
            System.out.println("Desea repetir el proceso? ()S/N");
            option = read.next();
        }while(option.equalsIgnoreCase("S"));
    }

    public static void convertedCelsius(double degreesCelcius){
        double kelvin = degreesCelcius + 237;
        System.out.println(degreesCelcius + " grados celsius son " + kelvin + " Kelvin");
    }
}
