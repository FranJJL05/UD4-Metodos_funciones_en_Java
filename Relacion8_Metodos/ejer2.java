/*2- Crea una función con la siguiente cabecera:
public String convierteEnPalabras(int n)
Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en
una cadena de caracteres. Por ejemplo, el 470213 convertido a palabras sería:
cuatro, siete, cero, dos, uno, tres
Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe
mostrar nada por pantalla, solo se debe usar print desde el programa principal. Fíjate que hay una
coma detrás de cada palabra salvo al final.
*/

package Relacion8_Metodos;

import java.util.Scanner;

public class ejer2 {

    public String convierteEnPalabras(int n) {
        String[] palabras = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };

        String cadena = String.valueOf(n);
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            int digito = cadena.charAt(i) - '0';

            if (i > 0) {
                resultado.append(", "); 
            }
            resultado.append(palabras[digito]);
        }

        return resultado.toString(); 
    }

    public static void main(String[] args) {
        ejer2 obj = new ejer2();

        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Introduce el numero:");
        num = entrada.nextInt();

        System.out.println(obj.convierteEnPalabras(num));

        entrada.close();
    }
}
