package com.java.basico;

/**
 * Operadores
 */
public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;


        // Aritméticos: * / + -
        int multiplica = numero1 * numero2;
        double divide = numero1 / (double) numero2; // evitar fazer cast
        int soma = numero1 + numero2;
        int subtrai = numero1 - numero2;

        String multiplicacao = "A multiplicacao entre "+numero1+" e "+numero2+" é: "+multiplica;
        String divisao = "A divisao entre "+numero1+" e "+numero2+" é: "+divide;
        String somaString = "A soma entre "+numero1+" e "+numero2+" é: "+soma;
        String subtracao = "A subtracao entre "+numero1+" e "+numero2+" é: "+subtrai;

        System.out.println( 
            multiplicacao+",\n"+
            divisao+",\n"+
            somaString+",\n"+
            subtracao+".\n"
        );


        // Aritméticos: % (resto da divisao)
        int numero3 = 3;
        int numero4 = 2;
        int resto = numero3 % numero4;
        String restoString = "O resto da divisao entre o numero "+numero3+
                             " e o numero "+numero4+" é "+resto;
        
        System.out.println(restoString+".\n");


        // Relacionais: <> <= >= == !=
        boolean isNumeroMaiorQue = numero1 > numero2;
        boolean isNumeroMenorQue = numero1 < numero2;
        boolean isNumeroIgualA = numero1 == numero2;
        boolean isNumeroDiferenteDe = numero1 != numero2;

        String maiorQue = numero1+" é maior que "+numero2+": "+isNumeroMaiorQue;
        String menorQue = numero1+" é menor que "+numero2+": "+isNumeroMenorQue;
        String igualA = numero1+" é igual a "+numero2+": "+isNumeroIgualA;
        String diferenteDe = numero1+" é diferente de "+numero2+": "+isNumeroDiferenteDe+"\n";
        
        System.out.println(maiorQue);
        System.out.println(menorQue);
        System.out.println(igualA);
        System.out.println(diferenteDe);


        // Logicos and e or: && (AND), || (OR), ! (NOT)
        int minhaIdade = 29;
        float meuSalario = 3500;

        boolean isDentroDaLeiMaiorQueTrinta = minhaIdade > 30 && meuSalario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = minhaIdade < 30 && meuSalario >= 3381;
        boolean isComparaCondicao = isDentroDaLeiMaiorQueTrinta || isDentroDaLeiMenorQueTrinta;
        String salarioHolanda = "O salario que recebo está dentro da lei? "+isComparaCondicao+"\n";

        System.out.println(salarioHolanda);


        // Atribuicao: = += -= /= %=
        int bonus = 1800;
        int contador = 0;
        int contador2 = 0;
        
        bonus += 1000; // 2800
        System.out.println(bonus);
        
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        System.out.println(bonus);
        
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus+"\n");
                
        contador += 1; // 1
        System.out.println(contador);
        
        contador -= 1; // 0
        System.out.println(contador);
        
        contador++; // 1
        System.out.println(contador+"\n");

        System.out.println(contador2++); // print 1, depois incrementa
        System.out.println(++contador); // incrementa, depois print
    }
}
