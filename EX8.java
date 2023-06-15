package com.mycompany.ex8;

import java.util.Scanner;

public class EX8 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
        int num;
        int par=0;
        int impar=0;
      
      for(int i=0;i<10;i++){
      System.out.print("Informe a sequencia numero positivos: ");
      num = teclado.nextInt();
      
        
             if (num%2==0)
               par = par+1;
               else 
               impar = impar+1;
      }
           System.out.println("Quantidade de numeros pares: " + par);
           System.out.println("Quantidade de numeros impares: " + impar);
    }
}
