package Lista6;

import java.util.Random;

public class Ex07 {
    public static void main(String[] args) {
        /*
         * Exercício 7 — Maior e menor elemento
         * Leia uma matriz 4 x 4 de números inteiros e apresente-a em formato de tabela.
         * 
         * Determine o maior e o menor valor armazenado, apresentando também a
         * localização (linha e coluna) da primeira ocorrência de cada um.
         * 
         */

        // Iniciando RANDOM para gerar uma matriz 4x4 com numeros aleatorios.
        // Dentro do main (crie apenas uma vez antes dos laços for/while):
        Random random = new Random();

        int[][] matrizA = new int[3][3];
        int maior = Integer.MIN_VALUE, maiorIdxI = 0, maiorIdxJ = 0, menor = Integer.MAX_VALUE, menorIdxI = 0, menorIdxJ = 0;

        // gera matriz aleatorio e mostra no terminal. 

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                int n = random.nextInt(-10, 21); // sorteia um numero de -10 até 20.
                matrizA[i][j] = n;
                System.out.printf(" %3d", matrizA[i][j]);

                // armezenando maior e menor e seus indices.
                
                if (maior < matrizA[i][j]) {
                    maior = matrizA[i][j];
                    maiorIdxI = i;
                    maiorIdxJ = j;
                } 
                if (menor > matrizA[i][j]) {
                    menor = matrizA[i][j];
                    menorIdxI = i; 
                    menorIdxJ = j;
                }
            }
            System.out.println();
        }

        System.out.println("Maior: " + maior + "\nPosição: " + maiorIdxI + "," + maiorIdxJ);
        System.out.println("Menor: " + menor + "\nPosição: " + menorIdxI + "," + menorIdxJ);

    }
}
