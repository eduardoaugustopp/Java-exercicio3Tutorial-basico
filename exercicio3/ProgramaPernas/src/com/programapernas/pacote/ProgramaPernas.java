package com.programapernas.pacote;

import java.util.Scanner;

public class ProgramaPernas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out. print ("Quantas pernas? ") ;
		int perna = tec.nextInt();
		String tipo;
		System.out.print("Isso é um(a) ");
		switch (perna) {
		case 1:
		tipo = "Saci";
		break;
		case 2:
		tipo = "Bipede";
		break;
		case 3:
		tipo = "Tripé";
		break;
		case 4:
		tipo = "Quadrúpede";
		break;
		case 6:
		tipo = "Aranha";
		break;
		default://default -> tipo padrão caso nenhum desses de cima seja escolhido pelo switch o tipo é "ET"; como é a ultima não precisa do break.
		tipo = "ET";
		}
		System.out.println(tipo);

	}

}
