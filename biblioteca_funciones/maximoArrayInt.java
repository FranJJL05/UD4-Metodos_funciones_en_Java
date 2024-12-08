package biblioteca_funciones;
//maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.

public class maximoArrayInt {
    
    public static int maximoArrayInt(int[] array){
        int maximo = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i]> maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }


    public static void main(String[] args) {
        int[] numeros= {2,5,5,7,1,9};
        System.out.println("El valor máximo es: " + maximoArrayInt(numeros));
    }
}
