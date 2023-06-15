
package urnaeletronica;
import java.util.Scanner;

public class UrnaEletronica {

    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
     
      int op;
      int opi;
      int a,b;
      int sair;
              
      System.out.println("Informe a opção desejada: \n1-Iniciar votação. \n2-Sair");
      opi= teclado.nextInt();
      
      System.out.println("Informe a quantidade de eleitores para votar: ");
      int elt= teclado.nextInt();
     
      while (opi!=2){
          
      int cand1 = 0;
      int cand2 = 0;
      int cand3 = 0;
      
      System.out.println("Informe a opção desejada: \n1-Listar candidatos. \n2-Votar. \n3-Contagem de votos. \n4.Sair.");
      op= teclado.nextInt();
     
      
      while (op == 1){
          
          System.out.println("Candidatos: \n1-João Leite - Numero 45. \n2-Julio Amaral - Numero 23. \n3-Fernando Lima - Numero 15.");
          
          System.out.println("\nDigite 0 para voltar:");
          sair = teclado.nextInt();
         
          if(sair == 0){
              break;
          } }
      while (op == 2){
          System.out.println("Informe o numero do candidato para votação ou digite: ");
          a=teclado.nextInt();
      
          if (a==45){
          System.out.println("João Leite - Numero 45\n"); 
          cand1=cand1+1;
          }
          else if(a==23){
          System.out.println("Julio Amaral - Numero 23\n"); 
          cand2=cand2+1;
          }
          else if(a==15){
          System.out.println("Fernando Lima - Numero 15\n"); 
          cand3=cand3+1;
          }
          else{
          System.out.println("Candidato inexistente\n");
          }
          System.out.println("\nDigite 1 para Contagem de votos ou 0 para voltar ao menu: \n");
          sair = teclado.nextInt();
         
          if (sair == 1){
          System.out.println("Contagem de votos: \n");

          System.out.println("João Leite - Numero 45 \n" + cand1); 
          System.out.println("Julio Amaral - Numero 23 \n" + cand2); 
          System.out.println("Fernando Lima - Numero 15 \n" + cand3);
          
          System.out.println("\nDigite 0 para voltar ao menu: \n");
          sair = teclado.nextInt();
          if(sair==0){
          break;
          }}
                  
          else if(sair == 0){
              break;
      }}

     }
    }
    
}
