import java.util.Scanner;

public class Exerc9 {

    /* 9. Acréscimo percentual
        Solicite ao usuário:

            o valor de um produto;
            o percentual de acréscimo.
            Calcule e mostre:

            o valor do acréscimo;
            o valor final do produto.
            Exemplo: um produto de R$ 100,00 com acréscimo de 15% terá valor final de R$ 115,00.
    
    */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double valorProduto, percentualAcrescimo, valorAcrescimo, valorFinal;

        System.out.print("Digite o valor do produto: ");
        valorProduto = scanner.nextDouble();  
        System.out.print("Digite o percentual de acréscimo: ");
        percentualAcrescimo = scanner.nextDouble();

        valorAcrescimo = valorProduto * (percentualAcrescimo / 100);

        valorFinal = valorProduto + valorAcrescimo;

        System.out.println("Valor do acréscimo: R$ " + valorAcrescimo);
        System.out.println("Valor final do produto: R$ " + valorFinal);

        scanner.close();

    }
}