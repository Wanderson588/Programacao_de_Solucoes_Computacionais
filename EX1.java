package com.mycompany.ex1;

import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        
   
        Scanner teclado = new Scanner(System.in);
     
      int op;
      int opi=0;
      float saldoin = 0;
      float sac,dep;
      
      System.out.println("Saldo em conta R$ " + saldoin + "\n");
     
      System.out.println("Informe a opção desejada: \n1-Iniciar Operação Bancaria. \n2-Sair");
      opi= teclado.nextInt();
     
      
      while (opi!=2){
         
         
      System.out.println("\nInforme a opção desejada: \n1-Sacar. \n2-Depositar. \n3-Sair. .");
      op= teclado.nextInt();

     
      while (op == 1){
          System.out.println("Informe o valor a ser sacado: ");
          sac=teclado.nextFloat();
          
         
          if (sac<saldoin){
              saldoin = saldoin-sac;
          System.out.print("Saldo R$ " + saldoin + "\n");}
          else
              System.out.print("Saldo Insuficiente. ");
          
          System.out.println("\nSe desejar mudar a operação digite sair:");
          var ex = teclado.next();
         
          if(ex.equals("sair")){
              break;
        }}
      while (op == 2){
          System.out.println("Informe o valor a ser depositado: ");
          dep=teclado.nextFloat();
          
         
          if (dep!=0){
              saldoin = saldoin+dep;
          System.out.print("Saldo R$ " + saldoin + "\n");}
          else
              System.out.print("Valor não pode ser depositado.");
          
          System.out.println("\nSe desejar mudar a operação digite sair:");
          var ex = teclado.next();
         
          if(ex.equals("sair")){
              break;
        }}
}
    }
}
