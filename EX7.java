package com.mycompany.ex7;

import java.util.Scanner;

public class EX7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int tentativa =0;
        int num;
        boolean correta = false;
        int sorteado = (int)(Math.random() * 100);
        
    while(!correta){
      System.out.print("Informe um número de 0 a 100: ");
      num = teclado.nextInt();
      tentativa++;
      
        if(num == sorteado){
        System.out.println("Parabéns! Você acertou em " + tentativa + " tentativas.");
        correta = true;
      }
      else if(num < sorteado){
        System.out.println("Errou! Tente um número maior.");  
      }
      else{
        System.out.println("Errou! Tente um número menor."); 
    }
    }       
}}
