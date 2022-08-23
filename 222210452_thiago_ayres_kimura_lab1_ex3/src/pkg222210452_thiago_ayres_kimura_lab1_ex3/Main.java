package pkg222210452_thiago_ayres_kimura_lab1_ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double salario;
        double novosala;
        double reaj;
        
        
        System.out.print("Digite seu salario: ");
        
        salario = input.nextDouble();
       
        if (salario>0 && salario<=400){
            reaj = (salario/100)*15;
            novosala = ((salario/100)*15)+salario;
            System.out.print("Seu novo salario eh de: " +novosala);
            System.out.print("\nValor do reajuste: " +reaj);
            System.out.print("\nReajuste de 15%");
        }
        else if(salario>400 && salario<=800){
            reaj = (salario/100)*12;
            novosala = ((salario/100)*12)+salario;
            System.out.print("Seu novo salario eh de: " +novosala);
            System.out.print("\nValor do reajuste: " +reaj);
            System.out.print("\nReajuste de 12%");
        }
        else if(salario>800 && salario<=1200){
            reaj = (salario/100)*10;
            novosala = ((salario/100)*10)+salario;
            System.out.print("Seu novo salario eh de: " +novosala);
            System.out.print("\nValor do reajuste: " +reaj);
            System.out.print("\nReajuste de 10%");
        }
        else if(salario>1200 && salario<=2000){
            reaj = (salario/100)*7;
            novosala = ((salario/100)*7)+salario;
            System.out.print("Seu novo salario eh de: " +novosala);
            System.out.print("\nValor do reajuste: " +reaj);
            System.out.print("\nReajuste de 7%");
        }
        else if(salario>2000){
            reaj = (salario/100)*4;
            novosala = ((salario/100)*4)+salario;
            System.out.print("Seu novo salario eh de: " +novosala);
            System.out.print("\nValor do reajuste: " +reaj);
            System.out.print("\nReajuste de 4%");
        }
        else{
            System.out.print("salario invalido!");
        }
        
    }
    
}
