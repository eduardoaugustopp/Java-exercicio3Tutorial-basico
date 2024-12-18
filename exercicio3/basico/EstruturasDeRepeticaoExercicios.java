package com.java.basico;

/*
 * break:
 * 
 * Dado o valor de um carro, descubra em
 * quantas vezes ele pode ser parcelado;
 * Condicao: valor da parcela >= 1000;
 */
public class EstruturasDeRepeticaoExercicios {
    public static void main(String[] args) {
        double valorCarro = 40000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+ parcela + " R$ " + valorParcela);
        }
    }
}
