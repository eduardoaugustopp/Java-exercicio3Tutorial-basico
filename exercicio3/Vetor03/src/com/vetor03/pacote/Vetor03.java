package com.vetor03.pacote;

import java.util.Arrays;

public class Vetor03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v[] = {3.5, 2.75, 9, -4.75};
		Arrays.sort(v);
		for (double valor:v) {
			System.out.print(valor + " ");
		}
	}

}
