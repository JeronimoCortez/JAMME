import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, thousands, tens, hundreds, units;
        String roman = "";
        System.out.println("Ingrese un numero");
        number = read.nextInt();
        if(number >= 1 && number <= 3999){
            thousands = number / 1000;
            tens = number / 100 & 10;
            hundreds = number / 10 % 10;
            units = number % 10;

            for (int i = 1; i < thousands; i++) {
                roman = roman + "M";
            }

            if (tens == 9){
                roman = roman + "CM";
            } else if (tens >= 5) {
                roman = roman + "D";
                for (int i = 6; i <= tens; i++) {
                    roman = roman + "C";
                }
            } else if (tens == 4) {
                roman = roman + "CD";
            } else {
                for (int i = 1; i <= tens; i++) {
                    roman = roman + "C";
                }
            }

            if (hundreds == 9) {
                roman = roman + "XC";
            } else if (hundreds >= 5) {
                roman = roman + "L";
                for (int i = 6; i <= hundreds; i++) {
                    roman = roman + "X";
                }
            } else if (hundreds == 4) {
                roman = roman + "XL";
            } else {
                for (int i = 1; i <= hundreds; i++) {
                    roman = roman + "X";
                }
            }

            if (units == 9) {
                roman = roman + "IX";
            } else if (units >= 5) {
                roman = roman + "V";
                for (int i = 6; i <= units; i++) {
                    roman = roman + "I";
                }
            } else if (units == 4) {
                roman = roman + "IV";
            } else {
                for (int i = 1; i <= units; i++) {
                    roman = roman + "I";
                }
            }

            System.out.println("El numero " + number + " en numeros romanos es " + roman);
        }else{
            System.out.println("Ingreso un numero fuera de parametros");
        }
    }
}
