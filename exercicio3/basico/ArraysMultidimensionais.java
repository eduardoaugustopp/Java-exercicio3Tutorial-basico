package com.java.basico;

/*
 * Sao arrays linkados
 * 
 * "nao é muito utilizado, no lugar, é utilizado 'Coleções (Map)'" 
 */
public class ArraysMultidimensionais {
    public static void main(String[] args) {
        System.out.println("Array 1:");
        int[][] array1 = new int[2][3];
        array1[0][0] = 9;
        array1[0][1] = 8;
        array1[0][2] = 7;

        array1[1][0] = 6;
        array1[1][1] = 5;
        array1[1][2] = 4;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]);
            }            
            System.out.println(); // quebrar linha para ver o segundo array
        }

        // maneira mais simplificada
        // arrays multidimensionais com inicializacao
        System.out.println("\nArray 2:");
        int[][] array2 = {{0, 1},{5},{3, 4, 9}};
        for (int[] arrayBase : array2) {
            for (int num : arrayBase) {
                System.out.print(num);
            }
            System.out.println();
        }           
        
    }
}
