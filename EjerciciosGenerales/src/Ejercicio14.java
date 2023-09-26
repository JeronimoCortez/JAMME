import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int students, note, greater, lesser, sum;
        System.out.println("Ingrese la cantidad de estudiantes: ");
        students = read.nextInt();
        System.out.println("Ingrese la nota del alumno 1");
        note = read.nextInt();
        sum = note;
        greater = note;
        lesser = note;
        for (int i = 2; i < students; i++) {
            System.out.println("Ingrese la nota del alumno " + i);
            note = read.nextInt();
            sum = sum + note;
            if(note > greater){
                greater = note;
            }else if(note < lesser){
                lesser = note;
            }
        }
        System.out.println("El promedio de las notas es: " + sum / students );
        System.out.println("La nota mayor es: " + greater);
        System.out.println("La nota menor es: " + lesser);
    }
}


