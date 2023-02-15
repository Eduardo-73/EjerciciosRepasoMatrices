/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author eduardo
 */
public class NumBinario {

    public static void main(String[] args) {

        Random gen = new Random();

        int n = 8;
        
        int[] encontrarCasilla = new int[0];
        
        int[][] matrix = new int[n][n];

        int numRandom = gen.nextInt(0, 2);

        //Relleno la matriz con el número aleatorio
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                numRandom = gen.nextInt(0, 2);
                matrix[i][j] = numRandom;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0 && matrix[i -1][j -1] == 1 && 
                        matrix[i -1][j +1] == 1){
                    encontrarCasilla[0] = i;
                    encontrarCasilla[1] = j;
                }
            }
        }
        if (matrix != null) {
            System.out.println("");
        }
    }

}
