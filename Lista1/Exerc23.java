import java.util.Scanner;

public class Exerc23 {

/*     23. Divisão de uma conta
            Solicite ao usuário:

            o valor total de uma conta;
            a quantidade de pessoas que dividirão a conta.
            Calcule e mostre quanto cada pessoa deverá pagar.

            Considere que a quantidade de pessoas sempre será maior que zero. */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double valorConta, numeroPessoas, valorCada;
        
        System.out.print("Informe o valor total da conta em reais: ");
        valorConta = scanner.nextDouble();

        System.out.print("Informe o número de pessoas que irão dividir a conta: ");
        numeroPessoas = scanner.nextDouble();


        valorCada = valorConta / numeroPessoas;

        System.out.println("Cada pessoa deve pagar R$ "+valorCada + ".");
        scanner.close();
    }

}

