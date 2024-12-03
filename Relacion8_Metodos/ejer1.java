/*1-Crea una función con la siguiente cabecera:
public static String convierteEnPalotes(int n)
Esta función convierte el número n al sistema de palotes y lo devuelve en una cadena de caracteres.
Por ejemplo, el 470213 en decimal convertido al sistema palotes es:
| | | | - | | | | | | | - - | | - | - | | |
Utiliza esta función en un programa para comprobar que funciona correctamente. Desde la función no
se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal. */

package Relacion8_Metodos;

import java.util.Scanner;

public class ejer1 {

    public static String convierteEnPalotes(int n) {
        String cadena = String.valueOf(n);
        String palos = " ";

        for (int i = 0; i < cadena.length(); i++) {
            int num = cadena.charAt(i) - 48;

            for (int j = 0; j < num; j++) {
                palos = palos + "|";
            }
            if (i < cadena.length() - 1) {
                palos = palos + "-";
            }
        }
        return palos;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.println("Introduce un numero");
        n = entrada.nextInt();

        System.out.println("El numero en palotes es: " + convierteEnPalotes(n));

        entrada.close();
    }

}
