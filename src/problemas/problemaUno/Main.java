package problemas.problemaUno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    /*
    1. Dado el siguiente ArrayList con números enteros:

    numeros = [5, 1, 1, 9, 7, 2, 6, 10]

    a) Realice un programa que mediante búsqueda lineal verifique si se encuentra un número entero ingresado durante la ejecución del programa,
    y muestre por pantalla el resultado en consola.

    b) Probar el programa con los números: 7, 10, 1, 0, -4, 8.
    */

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println(numeros);
        Collections.addAll(numeros, 5, 1, 1, 9, 7, 2, 6, 10);
        System.out.println(numeros);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número");
        int valorBuscado;
        valorBuscado = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.indexOf(i) == valorBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número está en el arreglo");
        } else {
            System.out.println("El número no está en el arreglo");
        }

    }
}
