package biblioteca_funciones;
//volteaArrayInt: Le da la vuelta a un array.

public class volteaArray {

    public static void volteaArrayInt(int[]array){
        int inicio=0;
        int fin= array.length -1;

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i]= array[fin -i];
            array[fin -i]= temp;
        }
    }

    public static void main(String[] args) {
        int[] numeros = { 5, 2, 7, 3, 9, 4 };

        System.out.println("Array original");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }

        volteaArrayInt(numeros);

        System.out.println("\nArray invertido: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
    }
}
