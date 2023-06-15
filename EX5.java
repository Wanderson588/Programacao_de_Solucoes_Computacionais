package com.mycompany.ex5;

public class EX5 {

    public static void main(String[] args) {
int [] vetor = new int[100];

           int soma=0;
           int par=0;
           int impar=0;
	   
	   for(int i=0;i<100;i++){
		   vetor[i] = (int) (1+ (Math.random()*100));
	   }
	   for(int i=0;i<100;i++){
               soma = soma +  vetor[i];
                              
               if (vetor[i]%2==0)
               par = par+1;
               else 
               impar = impar+1;
    }
           System.out.println("Soma das posições: " + soma);
           System.out.println("Quantidade de numeros pares: " + par);
           System.out.println("Quantidade de numeros impares: " + impar);
           
           for(int i=0;i<100;i++){
           System.out.println(vetor[i]);}
           
}}
