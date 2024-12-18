package com.java.basico;

import java.util.Scanner;

/*
 * Utilizando Switch e dado os valores de 1 a 7, imprima se 
 * é dia útil ou final de semana, considerando 1 como Domingo
 */

public class EstruturasCondicionaisExerciciosSwitch {
    public static void main(String[] args) {
        byte dia;
        
        System.out.print("Insira numero de 1 a 7 para dias da semana: ");
        Scanner input = new Scanner(System.in);
        dia = input.nextByte();
        System.out.print(dia+" é ");
        input.close();
        
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");                
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");  
                break;      
            default:
                System.out.println("Valor inserido inválido!");
                break;
        }
    }
}
