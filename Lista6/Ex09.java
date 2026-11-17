package Lista6;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        /*
         * Exercício 9 — Somas selecionadas
         * Leia uma matriz 4 x 4 de números inteiros. Calcule e apresente a soma dos
         * elementos:
         * 
         * Da linha de índice 2.
         * Da coluna de índice 1.
         * Da diagonal principal.
         * Da diagonal secundária.
         * De toda a matriz.
         */


        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[4][4];
        int somaL2 = 0, somaC1 = 0, somaDiagPrinc =0, somaDiagSec =0, somaMat = 0;

        // Lé os elementos para compor a matrizA.

        System.out.println("Informe valores inteiro para a MatrizA");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizA[i][j] = scanner.nextInt();
                somaMat += matrizA[i][j];
                if (i == 2) {
                    somaL2 += matrizA[i][j];
                }
                if (j == 1) {
                    somaC1 += matrizA[i][j];
                }
                if (i == j) {
                    somaDiagPrinc += matrizA[i][j];
                }
                if ((i + j == (matrizA.length - 1))) {
                    somaDiagSec +=  matrizA[i][j];
                }
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.printf("%3d ", matrizA[i][j]);
            }
            System.out.println();
        }

        System.out.printf( """
            
            Soma da Linha 3, IDX 2:  %d
            Soma da Coluna 2, IDX 1: %d
            Soma da Diagonal Princ.: %d
            Soma da Diagonal Sec.:   %d
            Soma da matriz complet.: %d

            """, somaL2, somaC1, somaDiagPrinc, somaDiagSec, somaMat);
        scanner.close();
    }
}
