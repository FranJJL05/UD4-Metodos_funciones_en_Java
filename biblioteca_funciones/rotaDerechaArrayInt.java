package biblioteca_funciones;
//rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.

public class rotaDerechaArrayInt {

    public static void rotaDerechaArrayInt(int[] array, int n) {
        int length = array.length;

        n = n % length;
        if (n == 0) {
            return;
        }
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = array[length - n + i];
        }

        for (int i = length - 1; i >= n; i--) {
            array[i] = array[i - n];
        }

        for (int i = 0; i < n; i++) {
            array[i] = temp[i];
        }
    }

    public static void main(String[] args) {
    int[] numeros = { 1, 2, 3, 4, 5 };
    int posiciones = 2;

    System.out.println("Array original:");
        for (int num : numeros) {
        System.out.print(num + " ");
    }

    rotaDerechaArrayInt(numeros, posiciones);

    System.out.println("\nArray rotado:");
    for (int num : numeros) {
        System.out.print(num + " ");
    }
    }
}
