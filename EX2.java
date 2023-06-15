
package com.mycompany.ex2;

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double hp, lp, ha, la, qtd;

        System.out.println("Informe os dados abaixo: \n1-Altura Parede: \n2-Largura Parede: \n3-Altura Azulejo: \n4-Largura Azulejo:" ); 
        hp= teclado.nextDouble();
        lp= teclado.nextDouble();
        ha= teclado.nextDouble();
        la= teclado.nextDouble();

        qtd = (hp * lp) / (ha * la);

        System.out.println("Quantidade de azulejos necessários para cobrir a parede: " + qtd); 
    }
}
