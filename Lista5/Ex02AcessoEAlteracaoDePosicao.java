package Lista5;

import java.util.Scanner;

public class Ex02AcessoEAlteracaoDePosicao {
    public static void main(String[] args) {

        /*
         * Exercício 2 — Acesso e alteração de posições
         * 
         * Crie um vetor de 6 posições contendo os valores {1, 0, 5, -2, -5, 7}.
         * 
         * O programa deverá:
         * 
         * 1 - Calcular e apresentar a soma dos elementos dos índices 0, 1 e 5.
         * 2 - Substituir o elemento do índice 4 pelo valor 100.
         * 3 - Exibir o vetor atualizado, com um elemento por linha.
         */
        Scanner scanner = new Scanner(System.in);

        int[] vetorValores = { 1, 0, 5, -2, -5, 7 };
        int soma = 0;

        for (int idx = 0; idx < vetorValores.length; idx++) {
            if (idx == 0 || idx == 1 || idx == 5) {
                soma += vetorValores[idx];
            }
            if (idx == 4) {
                vetorValores [idx] = 100;
            }
        }

        System.out.println();

        System.out.printf("Soma: %d + %d + %d = %d\n\n6", vetorValores[0],vetorValores[1],vetorValores[5], soma);

        System.out.println("Vetor: \n");
        for (int idx = 0; idx < vetorValores.length; idx++) {
            System.out.println(vetorValores[idx]);
        }

        System.out.println();

        scanner.close();
    }
}
