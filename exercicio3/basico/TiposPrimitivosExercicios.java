package com.java.basico;

public class TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Elias";
        String endereco = "Av. João Dias";
        float salario = (float) 3500.25;
        String dataRecebimentoSalario = "20/09/2022";
        String relatorio =  "Eu, "+nome+" morando no endereço: "+endereco+
            ", confirmo que recebi o salário de R$ "+salario+
            ", na data "+dataRecebimentoSalario+".";

        System.out.println(relatorio);
    }
}
