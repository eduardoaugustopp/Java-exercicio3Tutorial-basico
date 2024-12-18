package com.java.basico;

/*
 * Arrays
 * 
 * Padroes de inicializacao
 * - byte, short, int, long, float, double: 0
 * - char: '\u0000' ' '
 * - boolean: false
 * - String: null
 */

public class Arrays {
    public static void main(String[] args) {

        /**
         * formas de inicializar um array
         */
        System.out.println("\nFormas de iniciar um array:");
        int[] numeros = new int[3];
        int[] numeros2 = {2, 4, 6, 8, 10};
        int[] numeros3 = new int[]{1, 3, 5, 7, 9};

        System.out.println(numeros[2]);
        System.out.println(numeros2[2]);
        System.out.println(numeros3[2]);


        // percorrendo um array
        System.out.println("\nPercorrendo um array:");
        int[] idades = new int[4];
        idades[0] = 21;
        idades[1] = 14;
        idades[2] = 7;

        System.out.println("- for comum:");
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
        
        System.out.println("- foreach:");
        // ou com o "foreach"
        for (int i : idades) {
            System.out.println(i);
        }

        // sobrescrevendo um array
        // acao irreversivel e os dados se perdem
        System.out.println("\nSobreescrevendo um array:");
        String[] nomes = new String[3];
        nomes[0] = "Paula";
        nomes[1] = "Juliane";
        nomes[2] = "Jessica";

        System.out.println("- Array original:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println("- Array sobrescrito:");
        nomes = new String[]{"Paulo", "Joao"};
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
