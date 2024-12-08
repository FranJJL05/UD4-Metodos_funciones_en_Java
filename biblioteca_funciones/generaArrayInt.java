package biblioteca_funciones;
/*generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo
y máximo) se indica como parámetro*/

import java.util.Random;
import java.util.Scanner;

public class generaArrayInt {
    public static int[] generaArrayInt(int n, int min, int max) {
        Random random = new Random();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce cuantos caracteres va a tener el array");
        int n = entrada.nextInt();

        System.out.println("Introduce el valor minimo");
        int min = entrada.nextInt();

        System.out.println("Introduce el valor maximo");
        int max = entrada.nextInt();

        int[] resultado = generaArrayInt(n, min, max);

        System.out.print("Array generado: [");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
