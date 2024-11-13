package com.comparacaostring.pacote;

public class ComparacaoString {
	public static void main(String[] args) {
		String nome1 = "Gustavo";
		String nome2 = "Gustavo";
		String nome3 = new String("Gustavo"); 
		String res; 
		res = (nome1.equals(nome3))?"igual":"diferente"; /*nome1 com é um objeto ele pode ter métodos, equals é um metodo que verifica
		 se o conteudo de um objeto é igual ao conteudo do outro*/
		System.out.println(res); /*SAÍDA igual;
		*/
	}

}
