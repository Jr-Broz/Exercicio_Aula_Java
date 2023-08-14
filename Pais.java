package com.mycompany.exercicio5;
public class Pais {
    
    private String nome;
    private int populacao;
    
    
    Pais(String nome, int populacao){
        
        this.populacao = populacao;
        this.nome = nome;
    }   

  
//Nome Pais
    void setNome(String nome ){
        
        this.nome = nome;
    } 
    String getNome(){
        return this.nome;
    }




    //Populacao  
    void setPopulacao(){
        
     this.populacao = populacao;
        
    }
    
    int getPopulacao(){
        
     return this.populacao;
    }

}
