package Lista6;

import java.util.Scanner;

public class Ex15 {
    /*
     * Exercício 15 — Consulta de valores
     * Leia a quantidade linhade linhas e coluna de colunas de uma matriz, ambas com no
     * máximo 10. Em seguida, leia uma matriz linhax coluna contendo apenas valores
     * positivos.
     * 
     * Depois, leia uma quantidade indeterminada de valores. Para cada valor,
     * informe se ele está armazenado na matriz e, em caso afirmativo, a localização
     * (linha e coluna) da primeira ocorrência.
     * 
     * Para cada valor consultado, a mensagem deverá ser impressa apenas uma vez. O
     * programa termina quando for informado um valor negativo.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean quantLinhaOk = false, quantColunasOk = false;

        // verifica se linhae coluna receberam valores dentro do padrão. Solicitando apenas o
        // que não esta dentro do padrão.

        int linha= 0, coluna = 0; // iniciando variaveis com lixo para evitar erro de variavel não resolvida.

        do {
            if (!quantLinhaOk) {
                System.out.print("Informe um tamanho inteiro de 1 à 10 para a quantidade de linhas linha: ");
                linha= scanner.nextInt();
                if (linha<= 0 || linha> 10) {
                    System.out.println("Erro! tente novamente: ");
                    quantLinhaOk = false;
                    continue;
                } else {
                    quantLinhaOk = true;
                }
            }

            if (!quantColunasOk) {
                System.out.print("Informe um tamanho inteiro de 1 à 10 para a quanitdade de colunas coluna:");
                coluna = scanner.nextInt();
                if (coluna <= 0 || coluna > 10) {
                    System.out.println("Erro! tente novamente: ");
                    quantColunasOk = false;
                    continue;
                } else {
                    quantColunasOk = true;
                }
            }

        } while (!quantLinhaOk || !quantColunasOk);

        // lentro valores para uma matriz LxC4

        int[][] matrizA = new int[linha][coluna];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                do {
                    System.out.printf("Informe um valor inteiro positivo para %d,%d: ", i, j);
                    matrizA[i][j] = scanner.nextInt();
                    if (matrizA[i][j] > 0) {
                        break;
                    } else {
                        System.out.println("\nErro! Valor invalido... tente novamente.\n");
                    }
                } while (true);
            }
            System.out.println();
        }

        int x, idxi = 0, idxj = 0;

        do {
            boolean encontrado = false;
            System.out.print("Informe um valor inteiro positivo (valor negativo finaliza): ");
            x = scanner.nextInt();
            if (x < 0) {
                System.out.println("programa finalizado...");
                break;
            }

            for (int i = 0; i < matrizA.length && !encontrado; i++) {
                for (int j = 0; j < matrizA[i].length && !encontrado; j++) {
                    if (matrizA[i][j] == x) {
                        idxi = i;
                        idxj = j;
                        encontrado = true;

                    }
                }
            }

            if (encontrado) {
                System.out.println("O valor " + x + " existe na matrizA.\nSua primeira incidencia é na posição " + idxi
                        + "," + idxj);
            } else {
                System.out.println("Valor " + x + " não existe na matrizA.");
            }

        } while (true);

        scanner.close();

    }
}
