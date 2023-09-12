import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int month;
        System.out.println("Ingrese el numero del mes");
        month = read.nextInt();
        switch (month){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
        }
        if(month  == 2){
            System.out.println("EL mes tiene 28 dias");
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("El mes es de 30 dias");
        }else{
            System.out.println("El mes es de 31 dias");
        }

    }
}
