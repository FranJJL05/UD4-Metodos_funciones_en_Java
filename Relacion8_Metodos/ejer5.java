/*5- Define la función concatena con la siguiente cabecera:
public static int[] concatena(int[] a, int[] b)
Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de concatenar
ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 }, concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }. */

package Relacion8_Metodos;

public class ejer5 {
    public static int[] concatena(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            resultado[a.length + i] = b[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] a = { 8, 9, 0 };
        int[] b = { 1, 2, 3 };

        int[] resultado = concatena(a, b);

        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}
