import java.util.Scanner;

public class Exerc28 {
    /* 28. Salário por horas trabalhadas
        Solicite ao usuário:

        a quantidade de horas trabalhadas no mês;
        o valor recebido por hora.
        Calcule e mostre o salário bruto do funcionário. */

      public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 

        double horasTrabalhadas, valorHora, salarioBruto;

        System.out.print("Quantas horas foram trabalhadas? ");
        horasTrabalhadas = scanner.nextDouble();
        
        System.out.print("Qual o valor, em reais, da hora travalhada? ");
        valorHora = scanner.nextDouble();
        
        salarioBruto = horasTrabalhadas * valorHora;
        System.out.print("O salário bruto é: R$ " + salarioBruto);


        scanner.close();
    }
}
