package com.contador01.pacote;

public class Contador01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cc = 1;
		while (cc<5) {
			cc++;		
			if (cc == 1 || cc == 2 ) {
				continue;
			}
			if (cc == 4) {
				break;
			}
			System.out.println("Cambalhota " + cc);
		}
		
		
	}

}
