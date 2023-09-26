import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Ejercicio16 start = new Ejercicio16();
        start.run();
    }
    public void run (){
        Scanner read = new Scanner(System.in);
        int number = 0;
        int i = 2;
        System.out.println("Ingrese un numero: ");
        number = read.nextInt();

        while(i < number){
            int total = 0;
            total = number % i;
            if(total == 0){
                System.out.println("Este numero no es primo.");
                break;
            }
            if(i == number-1 && total != 0){
                System.out.println("Es un numero primo.");
            }
            i++;
        }
    }
}
