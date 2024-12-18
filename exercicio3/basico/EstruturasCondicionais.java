package com.java.basico;

import java.util.Random;

/**
 * Estruturas Condicionais
 */
public class EstruturasCondicionais {
    public static void main(String[] args) throws Exception  {
        /*
         * if e else
         * 
         * idade < 15: categoria infantil
         * idade >= 15 && < 18: categoria juvenil
         * idade >= 18: categoria adulto
         */
        int idade = 25;
        String categoria;

        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.println(categoria);


        /* 
         * Operador ternário:
         * Tipo (variavel) = (condicao) ? (se verdadeiro) : (se for falso);
         * 
         * doar se salario > 5000
         */
        double salario = 600 ;
        String mensagemDoar = "Doar R$ 500,00";
        String mensagemNaoDoar = "Não fazer doação";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        
        System.out.println(resultado);


        /*
         * Switch
         * 
         * Imprima o dia da semana considerando 1 como domingo 
         */        
        int dia;

        // randomico
        Random numeroAleatorio = new Random();
        dia = numeroAleatorio.nextInt(7);
        dia ++;
        System.out.println(dia);

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}