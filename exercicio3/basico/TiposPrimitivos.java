package com.java.basico;

public class TiposPrimitivos {
    public static void main(String[] args) throws Exception {
        int age = 37;
        long numeroGrande = 1000000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        char caractere = 'M';
        String nome = "Elias";

        System.out.println("A idade é "+age+" anos");
        System.out.println(verdadeiro);
        System.out.println("Eu sou o "+nome);

        System.out.println( 
            numeroGrande+", "+salarioDouble+", "+salarioFloat+", "
            +idadeByte+", "+idadeShort+", "+caractere
        );
    }    
}