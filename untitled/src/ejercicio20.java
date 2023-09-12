import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int note;
        System.out.println("Ingrese su nota");
        note = read.nextInt();
        if (note < 0 || note > 10) {
            System.out.println("Ingreso una nota incorrecta");
        }else if(note < 5){
            System.out.println("Insuficiente");
        } else if (note < 6) {
            System.out.println("Suficiente");
        } else if (note < 7) {
            System.out.println("Bien");
        } else if (note < 9) {
            System.out.println("Notable");
        } else{
            System.out.println("Sobresaliente");
        }
    }
}
