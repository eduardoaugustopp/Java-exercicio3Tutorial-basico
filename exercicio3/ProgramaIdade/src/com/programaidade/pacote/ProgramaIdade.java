package com.programaidade.pacote;

import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		System.out.println("Em que ano você nasceu ? ");
		int nasc = t.nextInt();
		int i = 2015 - nasc;
		System.out.println("Sua idade é " + i + " anos");
		if (i>=18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
	}

}
