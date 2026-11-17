package Lista6;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*
         * Exercício 8 — Multiplicação por escalar
         * Leia uma matriz A de inteiros 3 x 3 e, em seguida, um número inteiro K.
         * 
         * Crie uma matriz B em que cada elemento seja o elemento correspondente de A
         * multiplicado por K.
         * 
         * Apresente as matrizes A e B.
         */

         // Iniciando RANDOM para gerar uma matriz 4x4 com numeros aleatorios.
        // Dentro do main (crie apenas uma vez antes dos laços for/while):
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int[][] matrizA = new int[3][3];
        
        // gera matriz aleatorio e mostra no terminal. 
        System.out.println("MatrizA");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                int n = random.nextInt(-10, 21); // sorteia um numero de -10 até 20.
                matrizA[i][j] = n;
                System.out.printf(" %3d", matrizA[i][j]);
            }
            System.out.println();
        }

        System.out.println("Informe um valor inteiro k:");
        int k = scanner.nextInt();

        int [][] matrizB = new int[3][3];
        System.out.println("MatrizA X " + k + " = MatrizB");

        // escreve cada elemento da matrizA multiplicado pela escalar k nos respectivos lugares da matrizB. 
        // E imprime.
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizB[i][j] = (matrizA[i][j]) * k;
                System.out.printf(" %3d", matrizB[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
