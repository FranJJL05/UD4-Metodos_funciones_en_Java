/*3- Realiza un programa que pinte un triángulo relleno tal como se muestra en los ejemplos. El usuario
debe introducir la altura de la figura. Usar una función para que la implementación sea más sencilla.
Por ejemplo, se puede crear una función linea(char caracter, int repeticiones)
que pinte una línea con el carácter especificado */

package Relacion8_Metodos;

import java.util.Scanner;

public class ejer3 {

    public static void linea(char caracter, int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(caracter);
        }
        System.out.println(); 
    }

    public static void pintaTriangulo(int altura) {
        for (int i = altura; i >= 1; i--) {
            linea('*', i); 
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int altura;

        System.out.print("Introduce la altura del triángulo: ");
        altura = entrada.nextInt();

        pintaTriangulo(altura);

        entrada.close(); 
    }
}
