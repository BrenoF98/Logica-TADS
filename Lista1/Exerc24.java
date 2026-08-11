import java.util.Scanner;

public class Exerc24 {

    /* 24. Conta com gorjeta
            Solicite ao usuário:

            o valor consumido em um restaurante;
            o percentual de gorjeta.
            Calcule e mostre:

            o valor da gorjeta;
            o valor total da conta;
            o valor que cada pessoa deverá pagar, considerando que a conta será dividida igualmente entre quatro pessoas. */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 
        double valorConsumido, percentualGorjeta, valorGorjeta,valorTotal, valorCada;

        System.out.print("Informe o valor total da conta em reais: ");
        valorConsumido = scanner.nextDouble();
        System.out.print("Informe percentual de gorjeta: ");
        percentualGorjeta = scanner.nextDouble();

        valorGorjeta = valorConsumido * (percentualGorjeta/100);

        System.out.print("valor da gorjeta: R$" + valorGorjeta);

        valorTotal = (valorGorjeta + valorConsumido);
        valorCada = valorTotal / 4;

        System.out.print("O valor total é R$ " +valorTotal+ " e cada um deve pagar R$ " + valorCada);

        scanner.close();
    }

    
}
