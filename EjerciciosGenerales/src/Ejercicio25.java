/*La letra del dni se calcula de la siguiente forma:
Se dispone de una tabla de 23 letras. A cada una de las letras de la
tabla se le asocia un número entero. La tabla que contiene las letras del dni es esta:

0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22
T  R  W  A  G  M  Y  F  P  D   X   B   N   J   Z   S   Q   V   H   L   C   K   E

Para obtener la letra que corresponde a un dni se realiza la división del número de
dni entre 23 sin obtener decimales y nos quedamos con el resto de la división.
Este resto será un valor comprendido entre 0 y 22.
La letra del dni será la que tenga asociada el valor del resto de la división.
Por ejemplo, si queremos calcular la letra del dni 12345678 hay que realizar lo siguiente:
Obtenemos el resto de dividir el número entre 23: 12345678 % 23 =  14
Buscamos en la tabla el valor 14 y obtenemos la letra asociada al 14 que es la letra Z.
Método para calcualr la letra del dni utilizando un array de
caracteres que contiene las letras.
Método para calcualr la letra del dni utilizando un String formado por todas las letras.*/

public class Ejercicio25 {
    public static char calcularLetraDNI(int numeroDNI) {

        char[] tablaLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = numeroDNI % 23;

        return tablaLetras[resto];
    }

    public static char calcularLetraDNIString(int numeroDNI) {

        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numeroDNI % 23;

        return letrasDNI.charAt(resto);
    }
    public static void main(String[] args) {

        int numeroDNI = 12345678;

        char letra1 = calcularLetraDNI(numeroDNI);
        System.out.println("Letra del DNI (array de caracteres): " + letra1);
        char letra2 = calcularLetraDNIString(numeroDNI);
        System.out.println("Letra del DNI (String): " + letra2);
    }
}
