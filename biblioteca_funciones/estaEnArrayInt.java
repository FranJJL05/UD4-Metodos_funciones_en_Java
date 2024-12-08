package biblioteca_funciones;
//estaEnArrayInt: Dice si un número está o no dentro de un array.

import java.util.Scanner;

public class estaEnArrayInt {

    public static boolean estaEnArrayInt(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[] numeros = { 5, 7, 3, 2, 1, 9 };
        
        System.out.println("Introduce el numero a buscar");
        int numerobuscado = entrada.nextInt();

        if (estaEnArrayInt(numeros, numerobuscado)) {
            System.out.println("El numero buscado está en el aray");
        } else {
            System.out.println("El numero buscado no está en el array");
        }

    }
}
