import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name;
        int cont = 0;
        /*
        String name = "";
        while (!name.equals("10")) {
            System.out.println("Ingrese su nombre");
            name = read.next();
            System.out.println("Su nombre es: " + name);
        }
        while (cont < 10){
            System.out.println("Ingrese su nombre");
            name = read.next();
            System.out.println(name);
        }
 */
        for(int i = 1; i < 10; i++){
            System.out.println("Ingrese su nombre");
            name = read.next();
            System.out.println("El nombre ingresado es: " + name);
        }

        do{
            System.out.println("Ingrese su nombre");
            name = read.next();
            cont = cont + 1;
            System.out.println("Su nombre es: " + name);
        }while(cont < 4);
    }
}