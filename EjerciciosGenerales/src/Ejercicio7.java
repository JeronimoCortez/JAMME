import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numA, numB, sumA, sumB;
        sumA = 0;
        sumB = 0;
        System.out.println("Ingrese el numero A");
        numA = read.nextInt();
        System.out.println("Ingrese el numero B");
        numB = read.nextInt();
        for (int i = 1; i < numA; i++) {
            if (numA % i == 0){
                sumB = sumB + i;
            }
        }
        for (int i = 1; i < numB; i++) {
            if (numB % i == 0){
                sumA = sumA + i;
            }
        }
        if (sumA == numB && sumB == numA){
            System.out.println("Los numeros " + numA + " y " + numB + " son amigos");
        }else{
            System.out.println("Los numeros no son amigos");
        }
    }
}
