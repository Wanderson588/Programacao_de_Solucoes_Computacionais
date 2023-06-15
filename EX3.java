package com.mycompany.ex3;

import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        
        double n1,n2,n3,n4,n5,soma;
        String nome;

        System.out.println("Informe respectivamente seu nome e as 5 notas obtidas em sequencia:" );
        nome=teclado.next();
        n1= teclado.nextDouble();
        n2= teclado.nextDouble();
        n3= teclado.nextDouble();
        n4= teclado.nextDouble();
        n5= teclado.nextDouble();

        soma = n1+n2+n3+n4+n5;

        if (soma>=60)
        System.out.println("Aluno " + nome + " Aprovado com nota: " + soma);
        
        else if (soma>=40 && soma<60)
        System.out.println("Aluno " + nome + " Em recuperação com nota: " + soma);
        
        else
        System.out.println("Aluno " + nome + " Reprovado com nota: " + soma);
    }
}
