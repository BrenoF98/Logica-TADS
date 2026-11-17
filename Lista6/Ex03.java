package Lista6;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
         * Exercício 3 — Tabuada em matriz
         * 
         * Leia um número inteiro N, entre 1 e 10, e crie uma matriz N x N em que cada
         * elemento seja o produto do número da linha pelo número da coluna,
         * considerando a numeração a partir de 1.
         * 
         * Ou seja, o elemento de índice [i][j] deverá receber (i + 1) * (j + 1).
         * 
         * Apresente a matriz gerada.
         */

        System.out.println("Informe um valor N, para o tamanho da matriz quadrada: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] m = new int[N][N];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (i + 1) * (j + 1);
                System.out.printf(" %3d",m[i][j]);
            }
            System.out.println();
        }
        scanner.close();

    }
}
