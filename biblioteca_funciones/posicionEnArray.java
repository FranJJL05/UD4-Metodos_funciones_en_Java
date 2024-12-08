package biblioteca_funciones;
//posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se
//encuentra.

import java.util.Scanner;

public class posicionEnArray {
    
    public static int posicionEnArray(int[] array, int numero) {
        
        for (int i = 0; i < array.length; i++) {
            if (array[i]==numero) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[] numeros = {5,7,1,3,4,9,8};

        System.out.println("Introduce el numero a buscar");
        int numerobuscado = entrada.nextInt();

        int indice = posicionEnArray(numeros, numerobuscado);
        if (indice != -1) {
            System.out.println("El numero " + numerobuscado + " está en la posición " + indice);
        }else{
            System.out.println("El numero " + numerobuscado + " no está en el array");
        }
    }
}
