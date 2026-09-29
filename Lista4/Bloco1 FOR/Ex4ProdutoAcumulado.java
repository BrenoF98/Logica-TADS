import java.util.Scanner;

public class Ex4ProdutoAcumulado {
    public static void main(String[] args) {
        /*
         * 4. Produto acumulado
         * Leia um inteiro positivo n e calcule o produto de todos os inteiros de 1 ate
         * n. Informe tambem se o resultado ultrapassar 32 bits durante o calculo.
         */
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int produto = 1;
        boolean estouro = false; // variavel de controle para 32bits da variavel int.

        if (numero > 0) {

            for (int i = 1; i <= numero /* && !estouro */; i++) { // !estouro na condição do for evita processos
                                                                  // desnecessarios. porem não iria de 1 a n.

                // CHECAGEM:
                // Se o limite (2147483647) dividido pelo 'i' atual for menor que o produto
                // acumulado,
                // significa que a próxima multiplicação vai estourar os 32 bits.

                if (!estouro && produto > (Integer.MAX_VALUE / i)) {
                    estouro = true;
                }

                /* produto *= i; */

                if (!estouro) {
                    produto *= i; // alocando o "produto *= i;"" dentro do if com a condição !estouro, o calculo
                                  // não é realizado, mas o progrmama vai imprimir até n.
                    System.out.printf("i = %02d -> Produto acumalado = %d\n", i, produto);
                } else {
                    System.out.printf("i = %02d -> overflow\n", i);

                }
            }
        } else {
            System.out.println("Erro, valor invalido!");
        }

        scanner.close();
    }
}
