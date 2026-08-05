import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double valorProduto, percentualDesconto, valorDesconto, valorFinal;

        System.out.print("Digite o valor do produto: ");
        valorProduto = scanner.nextDouble();
        System.out.print("Digite o percentual de desconto: ");
        percentualDesconto = scanner.nextDouble();

        valorDesconto = valorProduto * (percentualDesconto / 100);
        valorFinal = valorProduto - valorDesconto;

        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final do produto: R$ " + valorFinal);

        scanner.close();
        
    }
}

