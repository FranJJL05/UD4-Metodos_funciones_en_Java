package biblioteca_funciones;
//minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro

public class minimoArrayInt {
    public static int minimoArrayInt(int[] array) {
        int minimo = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i]< minimo) {
                minimo = array[i];
            }
        }
        return minimo;

    }
    
    public static void main(String[] args) {
        int[] numeros = {5,2,7,3,6,8};
        System.out.println("El mínimo es: " + minimoArrayInt(numeros));
    }
}
