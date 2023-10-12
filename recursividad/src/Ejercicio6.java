import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int numeroUno, numeroDos;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numeroUno = read.nextInt();
        System.out.println("Ingrese con que numero desea sumarlo");
        numeroDos = read.nextInt();
        System.out.println("La suma de los dos numeros es: " + sumaNumeros(numeroUno,numeroDos));
    }
    public static int sumaNumeros(int numeroUno, int numeroDos){
        if(numeroUno == 0){
            return numeroDos;
        } else if (numeroDos == 0) {
            return numeroUno;
        }else{
            return 1 + sumaNumeros(numeroUno, numeroDos - 1);
        }
    }
}
