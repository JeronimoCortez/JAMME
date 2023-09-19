import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int add = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0){
                    add = add + j;
                }
            }
            if(add == i){
                System.out.println("El numero " + i + " es perfecto");
            }
        }
    }
}
