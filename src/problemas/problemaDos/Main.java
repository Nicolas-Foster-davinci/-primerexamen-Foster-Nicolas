package problemas.problemaDos;

import java.util.ArrayList;
/*

Dado el siguiente arreglo bidimensional de números enteros:

numeros = {{2, 3, 4, 5}, {2, 3, 4, 5}, {2, 3, 4, 5}, {2, 3, 4, 5}};

a) Realice un programa que calcule la suma en la diagonal principal.
(nota: la diagonal principal se compone de los números cuya posición i de
la primera dimensión del arreglo es igual a la posición j de la segunda
dimensión. Ejemplo: a11, a22, a33).
*/

public class Main {
    public static void main(String[] args) {
        int arreglo[][] = new int[4][4];

        arreglo[0][0] = 2;
        arreglo[0][1] = 3;
        arreglo[0][2] = 4;
        arreglo[0][3] = 5;

        arreglo[1][0] = 2;
        arreglo[1][1] = 3;
        arreglo[1][2] = 4;
        arreglo[1][3] = 5;

        arreglo[2][0] = 2;
        arreglo[2][1] = 3;
        arreglo[2][2] = 4;
        arreglo[2][3] = 5;

        arreglo[3][0] = 2;
        arreglo[3][1] = 3;
        arreglo[3][2] = 4;
        arreglo[3][3] = 5;

        int sumaDiagonal = 0;

        for (int i=0; i<arreglo.length; i++){
            for (int j=0; j<arreglo[i].length; j++)
            {
                System.out.print(arreglo[i][j]);
            }
            System.out.println();
        }

        for (int i=0; i<arreglo.length; i++){
            for (int j=0; j<arreglo[i].length; j++)
            {
                if(i==j){
                    sumaDiagonal += arreglo[i][j];
                }

            }

        }

        System.out.println(sumaDiagonal);
    }
}
