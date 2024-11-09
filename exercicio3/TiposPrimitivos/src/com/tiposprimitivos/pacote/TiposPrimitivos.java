//Saída de dados e entrada de dados

package com.tiposprimitivos.pacote;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in) ;
    	System.out.print("Digite o nome do aluno: ");
    	String nome = teclado.nextLine();
    	System.out.print("Digite a nota do aluno: ");
    	float nota = teclado.nextFloat();
    	System. out. format("A nota de %s é %.1f \n", nome, nota);
    	
    	
//        String nome = "Eduardo";
//        float nota = 8.5f;
//        System.out.print("A nota é " + nota + "\n");
//        System.out.println("A nota é " + nota);
//        System.out.printf("A nota é %.2f\n", nota); 
//        System.out.format("A nota de %s é %f\n", nome, nota); 
        
    }
}
