import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, aux, inverted;
        inverted = 0;
        System.out.println("Introduce un numero mayor o igual a 10");
        number = read.nextInt();
        if (number >= 10 ){
            aux = number;
            while (aux != 0){
                inverted = inverted * 10 + (aux % 10);
                aux = aux / 10;
            }
            if (number == inverted){
                System.out.println("Es capicua");
            }else{
                System.out.println("No es capicua");
            }
        }else{
            System.out.println("Ingreso un numero fuera de parametros");
        }
    }
}
