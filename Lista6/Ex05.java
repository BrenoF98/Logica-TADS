package Lista6;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Exercício 5 — Tabuleiro de xadrez
         * Leia o tamanho N de uma matriz quadrada e preencha-a automaticamente com um
         * padrão de tabuleiro de xadrez, alternando entre 0 e 1.
         * 
         * Exemplo para N = 4:
         * 
         * 0 1 0 1
         * 1 0 1 0
         * 0 1 0 1
         * 1 0 1 0
         */

        System.out.println("Informe um valor N, para o tamanho da matriz quadrada: ");

        int N = scanner.nextInt();
        int[][] m = new int[N][N];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if ((i + j) % 2  != 0) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
                System.out.printf(" %d",m[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
