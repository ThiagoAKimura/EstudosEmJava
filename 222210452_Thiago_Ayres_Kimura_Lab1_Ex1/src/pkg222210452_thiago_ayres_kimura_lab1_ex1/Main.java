package pkg222210452_thiago_ayres_kimura_lab1_ex1 ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner input = new Scanner (System.in)) {
            int numLado;
            int i;
            int espaco;
            
            
            System.out.print("Digite o numero de lados\n");
            
            numLado = input.nextInt();
            
            if(numLado > 1 && numLado<=20){
                //Parte de Cima
                for( i=0; i<numLado ; i++){
                    System.out.print("*");
                    
                }
                //Lado esquerdo
                for(i=0;i<numLado-2;i++){
                    System.out.print("\n*");
                    for(espaco=0;espaco<numLado-2;espaco++){
                        System.out.print(" ");
                    }
                    
                    System.out.print("*");
                }

                
                
                System.out.print("\n");
                
                //Parte de Baixo
                for( i=0; i<numLado ; i++){
                    System.out.print("*");
                    
                }
                
            }
            else{
                System.out.print("Numero invalido.");
            }
        }
        
        
    }
    
}
