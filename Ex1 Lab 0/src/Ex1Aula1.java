//1. Faça um programa que retorne o produto de três números reais.


import java.util.Scanner;

public class Ex1Aula1 {
    
    public static void main (String[] args){

        System.out.println("Digite o primeiro número inteiro: ");

        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();

        System.out.println("Digite o segundo número inteiro: ");

        Scanner input2 = new Scanner(System.in);

        double num2 = input2.nextDouble();

        System.out.println("Digite o terceiro número inteiro: ");

        Scanner input3 = new Scanner(System.in);

        double num3 = input3.nextDouble();

        double prod = (num1 * num2 * num3);

        System.out.println("O produto dos três números é: " + prod);

        input.close();
        input2.close();
        input3.close();

    }

}
