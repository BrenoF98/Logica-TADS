import java.util.Scanner;

public class Ex23SomaAteValorPositivo {
    public static void main(String[] args) {
        /*
         * 23. Soma ate valor positivo
         * Solicite numeros inteiros usando do-while ate que o usuario informe um numero
         * positivo. Mostre quantas tentativas foram necessarias e a soma dos valores
         * negativos digitados.
         */
        Scanner scanner = new Scanner(System.in);
        int valorN;
        int soma = 0;
        int tentativas = 0;

        do {
            System.out.println("Informe um valor inteiro: ");
            valorN = scanner.nextInt();

            if (valorN < 0) {
                soma += valorN;
            }
            tentativas++;
        } while (valorN <= 0);

        System.out.printf("\nSoma dos negativos: %d\nQuantidade de tentativas: %d", soma, tentativas);

        System.out.println();
        scanner.close();
    }
}
