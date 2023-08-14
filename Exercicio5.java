package com.mycompany.exercicio5;
import java.util.Scanner;
import java.lang.Math;
public class Exercicio5 {
   
    public static void main(String[] args) {
        
      String aux1;
        int aux2;
        
        String paisMaiorPop = " ";
        int maiorPop = 0;
        
      Pais[] p = new Pais[6];
        
      Scanner scan = new Scanner(System.in);
        
      for(int i=0; i < 6;i++){
          
          System.out.println("Coloque o nome do pais " + (i+1));
          aux1 = scan.next();
          
          System.out.println("Informe a populacao do pais " + (i+1));
          aux2 = scan.nextInt();
          
          p[i] = new Pais(aux1, aux2);
                 
          if(aux2 > maiorPop){
            
              paisMaiorPop = aux1;
              maiorPop = aux2;
              
          }
      }     
        System.out.println("O país: " +  paisMaiorPop  + "Possui a maior populacao de: " + maiorPop);
    }
}
