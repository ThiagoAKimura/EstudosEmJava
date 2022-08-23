import java.util.Scanner;

/*
Dada a distância D do robô até o início da
quadra, onde está a cesta, a regra é a
seguinte:
• Se D ≤ 800, a cesta vale 1 ponto;
• Se 800 < D ≤ 1400, a cesta vale 2 pontos;
• Se 1400 < D ≤ 2000, a cesta vale 3 pontos.
Escreva um programa para calcular o número
de pontos de cada lançamento. 
*/

public class Exercicio1 
{
    public static void main(String[] args) 
    {

        System.out.println("Digite a distancia do robo:");

        Scanner input = new Scanner(System.in);

        int D = input.nextInt();

        if(D <= 800 && D >0){
            System.out.println("1 ponto");
        }

        if(D >= 801 && D <= 1400){
            System.out.println("2 pontos");
        }

        if(D >= 1401 && D <= 2000){
            System.out.println("3 pontos");
        }

        if(D>2000 || D<0){
            System.out.println("Distancia invalida!!!");
        }


        input.close();

        
    }  
    

}

