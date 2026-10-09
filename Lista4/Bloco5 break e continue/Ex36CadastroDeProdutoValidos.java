import java.util.Scanner;

public class Ex36CadastroDeProdutoValidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * 36. Cadastro de produtos validos
         * Leia 10 pares de preco e quantidade. Use continue quando algum dado for
         * invalido. Para os pares validos, calcule o valor total e use break se o
         * estoque acumulado ultrapassar 1.000 unidades.
         */

        float preco = 0, valorTotal = 0;
        int quantidade = 0, quantidadeTotal = 0;
        ;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Informe o preço do produto %d: ", i);
            preco = scanner.nextFloat();

            System.out.printf("Informe a quantidade do produto %d: ", i);
            quantidade = scanner.nextInt();

            if (preco <= 0 || quantidade <= 0)
                continue; // continue pula o bloco para o passo em que a condição for satifeita.

            valorTotal += preco * quantidade;

            quantidadeTotal += quantidade;

            if (quantidadeTotal > 1000) break; // break encerra o laço. 

        }

        System.out.printf("\nValor total: %.2f", valorTotal);
        System.out.printf("Estoque acumulado: %d", quantidadeTotal);

        scanner.close();
    }
}
