package com.java.basico;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        /*
         * While e For
         */
        int count = 1;
        while (count < 10) { // condicao
            System.out.println("While "+ ++count);
        }

        for (int i=0; i<10; i++) { // trabalha com indices
            System.out.println("For "+i);
        }
        
        // Imprima todos os numeros pares de 0 até 1000
        System.out.println("WHILE: Numeros pares de 0 a 1000");
        count = 1;
        while (count <= 1000) {
            if (count % 2 == 0) {
                System.out.print(count+"; ");
            }
            count++;
        }

        System.out.println("\nFOR: Numeros pares de 0 a 1000");
        for (int i=1; i<=1000; i++) {
            if (i % 2 == 0) {
                System.out.print(i+"; ");
            }
        }

        /*
         * break
         * 
         * Imprima os primeiros 25 numeros de um dado valor, 
         * por exemplo: 50
         */
        int valor = 50;
        System.out.println("\nUsando o break");
        for (int i = 0; i <= 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.print(valor + i + "; ");
        }

        // evitando o "break"
        System.out.println("\nEvitando o break");
        for (int i = 0; i <=25; i++) {
            System.out.print(valor + i + "; ");
        }

        /*
         * continue
         * 
         * quantas parcelas (e seus valores) de um carro sendo que 
         * o valor minimo é de R$1000,00
         */
        double valorCarro = 30000;
        for (int parcela = (int)valorCarro; parcela > 0; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000)             {
                continue;
            }
            System.out.println("Parcela "+parcela+" R$ "+valorParcela);            
        }
    }
}
