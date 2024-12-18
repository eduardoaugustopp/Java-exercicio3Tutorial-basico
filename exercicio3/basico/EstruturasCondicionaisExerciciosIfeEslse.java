package com.java.basico;

import java.util.Scanner;

/**
 * Imposto por salario anual (valores fictícios)
 * 
 * 0 até 34712      = 9.7%
 * 34712 até 68507  = 37.35%
 * acima de 68507   = 49.5%
 */
public class EstruturasCondicionaisExerciciosIfeEslse {
    public static void main(String[] args) {
        double salarioAnual;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.5 / 100;
        double resultado;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o salario ANUAL: ");
        salarioAnual = input.nextDouble();
        input.close();

        if (salarioAnual <= 34712) {
            resultado = salarioAnual * primeiraFaixa;
        } else if (salarioAnual <= 68507) {
            resultado = salarioAnual * segundaFaixa;
        } else {
            resultado = salarioAnual * terceiraFaixa;
        }
        System.out.println(resultado);
    }
}
