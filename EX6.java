package com.mycompany.ex6;

import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
    int op=0;
    double C, F;
    
    System.out.println("Informe a unidade de temperatura desejada para conversão: \n1-Celsius. \n2-Fahrenheit." ); 
    op= teclado.nextInt();
    
    if (op ==1){
        System.out.println("Informe a temperatura em Fahrenheit." ); 
        F= teclado.nextDouble();
        C=((F-32)/1.8);
        System.out.println("A temperatura em Celsius é: " + C + "°C");
    }
    else if (op ==2){
        System.out.println("Informe a temperatura em Celsius." ); 
        C= teclado.nextDouble();
        F = C * 1.8 + 32;
        System.out.println("A temperatura em Fahrenheit é: " + F + "°F");
    }

    }
}
