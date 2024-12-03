/*4- Define la función convierteArrayEnString con la siguiente cabecera:
public static String convierteArrayEnString(int[] a)
Esta función toma como parámetro un array que contiene números y devuelve una cadena de
caracteres con esos números. Por ejemplo, si a = { }, convierteArrayEnString(a) devuelve “”; si a = { 8 },
convierteArrayEnString(a) devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
“62501”.
 */

package Relacion8_Metodos;

public class ejer4 {
    public static String convierteArrayEnString(int[] a) {
        StringBuilder result = new StringBuilder();

        for (int num : a) {
            result.append(num);
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        // Ejemplo de prueba
        int[] a = { 6, 2, 5, 0, 1 };
        System.out.println(convierteArrayEnString(a));
    }
}
