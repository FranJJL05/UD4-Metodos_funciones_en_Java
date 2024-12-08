package biblioteca_funciones;
// mediaArrayInt: Devuelve la media del array que se pasa como parámetro.

public class mediaArrayInt {

    public static double mediaArrayInt(int[] array) {
        int suma=0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return (double) suma / array.length;
    }


    public static void main(String[] args) {
        int[] numeros ={5,2,7,3,9,1};
        System.out.println("La media es: " + mediaArrayInt(numeros));
    }
}
