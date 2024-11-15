package com.lacoaninhado.pacote;

public class LacoAninhado {

	public static void main(String[] args) {
		// Laço externo: controla as linhas
		for (int linha = 0; linha < 3; linha++) {
			// Laço interno: controla as colunas
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print("*"); // Imprime um asterisco na mesma linha
			}
			System.out.println(); // Pula para a próxima linha
		}
	}
}