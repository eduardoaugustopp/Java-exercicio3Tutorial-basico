package com.testefuncao02.pacote;

public class Operacoes {

	public static String contador (int i, int f)  {//método que vai retornar uma string
		String s = ""; //vai iniciar vazio
		for (int c = i; c <= f; c++)//contar do início ao fim
		s += c + " ";	//fazer com que s a string receba ele mesmo concatenado com o c e um espaço em branco

		return s;
	}
}
//Agora precisa chamar esse método mas a chamada esta em outro arquivo