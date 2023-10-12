import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] lista = {1,2,3,4,5};
        boolean existeElemento = false;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el elemento que desea buscar en la lista");
        int elemento =  read.nextInt();
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] == elemento) {
                existeElemento = true;
                break;
            }
        }
        if(existeElemento){
            System.out.println("El elemento esta en la lista");
        }else{
            System.out.println("El elemento no esta en la lista");
        }
    }
}