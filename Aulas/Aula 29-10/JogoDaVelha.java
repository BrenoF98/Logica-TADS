import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] tabuleiro = { // vetor que repsetrana as posições
                /*
                 * 1 2 3
                 * 4 5 6
                 * 7 8 9
                 */
                ' ', ' ', ' ',
                ' ', ' ', ' ',
                ' ', ' ', ' '
        };

        char jogador = 'O';
        int numJogadas = 0;
        int posicao = 0;
        boolean ganhou = false;

        do {

            // capitura a posição a ser jogada pelo jogador da vez.
            System.out.println("\nJogador " + jogador + " Informe a posição (0 para sair): \n\n1 2 3\n4 5 6\n7 8 9");
            posicao = scanner.nextInt() - 1; // -1 para a seleção ficar natural. de 1 a 9 para o usuario mas para o
                                             // sistema considera posição do vetor partindo de 0

            // Finalizar o jogo.
            if (posicao == -1)
                break;

            // erro de posição invalida.
            if (posicao < 0 || posicao > 8 || tabuleiro[posicao] == 'O' || tabuleiro[posicao] == 'O') {
                System.out.println("Erro... Posição invalida! Tente novamente.");

                // mostra o tabuleiro depois do erro.

                for (int i = 0; i < tabuleiro.length; i++) {
                    System.out.print(tabuleiro[i]);
                    if ((i + 1) % 3 != 0) {
                        System.out.print(" | ");
                    }
                    if ((i + 1) % 3 == 0 && i != tabuleiro.length - 1) {
                        System.out.println("\n---------");
                    }
                }

                continue;

                // jogo acontece aqui.
            } else {

                numJogadas++;
                tabuleiro[posicao] = jogador;

            }

            for (int i = 0; i < tabuleiro.length; i++) {
                System.out.print(tabuleiro[i]);
                if ((i + 1) % 3 != 0) {
                    System.out.print(" | ");
                }
                if ((i + 1) % 3 == 0 && i != tabuleiro.length - 1) {
                    System.out.println("\n---------");
                }
            }

            if (numJogadas % 2 == 0) {
                jogador = 'O';
            } else {
                jogador = 'X';
            }

            // logica de vitoria.

            for (int i = 0; i < tabuleiro.length; i += 3) { // linha

                if (tabuleiro[i] != ' ' && tabuleiro[i] == tabuleiro[i + 1]
                        && tabuleiro[i + 1] == tabuleiro[i + 2]) {
                    ganhou = true;

                    break;
                }
            }

            for (int i = 0; i < 3; i++) { // coluna
                if (tabuleiro[i] != ' ' && tabuleiro[i] == tabuleiro[i + 3]
                        && tabuleiro[i + 3] == tabuleiro[i + 6]) {
                    ganhou = true;

                    break;
                }
            }

            if (tabuleiro[0] != ' ' && tabuleiro[0] == tabuleiro[4]
                    && tabuleiro[4] == tabuleiro[8]) {
                ganhou = true;

                break;
            }
            if (tabuleiro[2] != ' ' && tabuleiro[2] == tabuleiro[4]
                    && tabuleiro[4] == tabuleiro[6]) {
                ganhou = true;

                break;
            }

            /*
             * 0 1 2
             * 3 4 5
             * 6 7 8
             */

        } while (true);

        if (ganhou) {
            System.out.println("\n\nGanhou!");
        }
        scanner.close();

    }
}
