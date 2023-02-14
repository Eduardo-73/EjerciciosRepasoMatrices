/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Repaso;

import java.util.Random;

/**
 *
 * @author eduar
 */
public class MatrizNumAleatorio {

    public static void main(String[] args) {

        Random gen = new Random();

        int n = 5;//Tamaño de la matriz

        int[][] matrix = new int[n][n];

        int numMax = n * n;//Determino el número máximo de mi matriz

        int numAleatorio = gen.nextInt(numMax) + 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                do {
                    numAleatorio = gen.nextInt(numMax) + 1;//A cada vuelta cambia el número aleatorio
                    if (!comprobar(matrix, numAleatorio)) {//Si el número no estaba en la matriz
                        matrix[i][j] = numAleatorio;
                    }
                } while (comprobar(matrix, numAleatorio));
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean comprobar(int[][] matrizAux, int numComprobar) {
        //Comprobar si los números se repiten
        for (int i = 0; i < matrizAux.length; i++) {
            for (int j = 0; j < matrizAux.length; j++) {
                if (matrizAux[i][j] == numComprobar) {
                    return true;
                }
            }
        }
        return false;
    }
}
