import java.util.Scanner;

public class Exerc11 {
    /* 11. Comissão de venda
        Solicite ao usuário:

        o valor total vendido por um funcionário;
        o percentual de comissão recebido.
        Calcule e mostre o valor da comissão. */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorVendas, percentualComissao, valorComissao;
        
        System.out.print("Digite o valor total vendido: ");
        valorVendas = scanner.nextDouble();
        
        System.out.print("Digite o percentual de comissão: ");
        percentualComissao = scanner.nextDouble();
        
        valorComissao = valorVendas * (percentualComissao / 100);
        System.out.println("O valor da comissão é: " + valorComissao);

        scanner.close();

    }
}