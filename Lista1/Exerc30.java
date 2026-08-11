import java.util.Scanner;

public class Exerc30 {

    /* 230. Quantidade de carne para churrasco
            Solicite ao usuário:

            a quantidade de homens;
            a quantidade de mulheres;
            a quantidade de crianças.
            Considere o seguinte consumo médio:

            Homem: 400 gramas
            Mulher: 320 gramas
            Criança: 200 gramas 
            Calcule e mostre:

            a quantidade total de carne em gramas;
            a quantidade total de carne em quilogramas.*/


          public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 

        double quantHomem, quantMulher, quantCrianca, quantTotalg, quantTotalkg;

        System.out.print("Quantos homens irão ao churasco? ");
        quantHomem = scanner.nextDouble();
        
        System.out.print("Quantas mulheres irão ao churrasco? ");
        quantMulher = scanner.nextDouble();
        
        System.out.print("Quantas crianças irão ao churrasco? ");
        quantCrianca = scanner.nextDouble();

        quantTotalg = (quantHomem * 400) + (quantMulher * 320) + (quantCrianca * 200);
        quantTotalkg = quantTotalg / 1000;

        System.out.print("A quantidade total em gramas é: " + quantTotalg + " g\nA quantidade total em quilogramas é: " + quantTotalkg + " kg");


        scanner.close();
    }
    
}