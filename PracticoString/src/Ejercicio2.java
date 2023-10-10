import javax.swing.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int value, mayorNeg = -9999999 , cantPos = 0, sumaPos = 0, prom = 0;
        int [] nums = new int [10];
        Scanner teclado = new Scanner(System.in);
        for(int i=0; i < 10; i++){
            System.out.println("Ingrese el valor " + (i+1) + " del arreglo: ");
            value = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor " + (i+1) + " del arreglo."));
            nums[i] = value;
        }
        for(int i=0;i < 10;i++){
            if (nums[i] > 0){
                sumaPos = nums[i] + sumaPos;
                cantPos += 1;
            } else if (nums[i] < 0){
                if(nums[i] > mayorNeg) {
                    mayorNeg = nums[i];
                }
            }
        }
        prom = sumaPos / cantPos;
        JOptionPane.showMessageDialog(null,"el promedio de los positivos es: " + prom + ".");
        JOptionPane.showMessageDialog(null,"El mayor de los negativos es: " + mayorNeg + ".");
    }
}
