
package com.mycompany.ex9;

import java.util.Scanner;

public class EX9 {

    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);

int aluno=0;

System.out.println("Informe a quantidade de aluno:");
aluno=teclado.nextInt();

double[] nota = new double[aluno];
double soma = 0;
double media;

for(int i = 0; i < nota.length; ++i){
    System.out.println("Digite a nota n"+(i+1)+"º : ");
    nota[i] = teclado.nextDouble();
    soma = soma + nota[i];
}
   
  media = soma/nota.length;
  
  System.out.println("A média "+media);
        
}  
}

