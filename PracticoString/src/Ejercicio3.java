import java.util.Scanner;
import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int value, menor_pares = 9999999 , cant_impares = 0;
        int [] nums = new int [10];
        Scanner teclado = new Scanner(System.in);
        for(int i=0; i < 10; i++){
            System.out.println("Ingrese el valor " + (i+1) + " del arreglo: ");
            value = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor " + (i+1) + " del arreglo."));
            nums[i] = value;
        }
        for(int i=0;i < 10;i++){
            if(nums[i] % 2 == 0){
                if(nums[i] < menor_pares){
                    menor_pares = nums[i];
                }
            }
            else{
                cant_impares += 1;
            }
        }
        JOptionPane.showMessageDialog(null,"El menor de los pares es: " + menor_pares + ".");
        JOptionPane.showMessageDialog(null,"La cantidad de impares es: " + cant_impares + ".");
    }
}
