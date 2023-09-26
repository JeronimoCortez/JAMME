import java.util.Scanner;

public class Ejercicio10 {
        public static void main(String[] args) {
            long numero, aux, digito, decimal;
            int exp;
            boolean esBinario;
            Scanner teclado = new Scanner(System.in);
            do {
                System.out.print("Introduce un numero binario: ");
                numero = teclado.nextLong();
                esBinario = true;
                aux = numero;
                while (aux != 0) {
                    digito = aux % 10;
                    if (digito != 0 && digito != 1) { //si no es 0 ó 1
                        esBinario = false;
                    }
                    aux = aux / 10;
                }
            } while (!esBinario);

            exp = 0;
            decimal = 0;
            while (numero != 0) {
                digito = numero % 10;
                decimal = decimal + digito * (int) Math.pow(2, exp);
                exp++;
                numero = numero / 10;
            }
            System.out.println("Decimal: " + decimal);
        }
    }

