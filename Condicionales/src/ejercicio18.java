import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int h, m, s;
        System.out.print("Ingrese la hora: ");
        h = read.nextInt();
        System.out.print("Ingrese los minutos: ");
        m = read.nextInt();
        System.out.print("Ingrese los segundos: ");
        s = read.nextInt();
        if(h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            System.out.println("La hora ingresada es " + h + ":" + m + ":" + s);
        }else{
            System.out.println("Formato incorrecto");
        }
    }
}
