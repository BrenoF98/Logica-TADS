package Lista5;

import java.util.Scanner;

public class Ex01ArmazenamentoExebicao {
    public static void main(String[] args) {

        /*
         * Exercício 1 — Armazenamento e exibição
         * Crie um programa que leia 8 números inteiros e os armazene em um vetor. Após
         * a leitura, apresente todos os elementos na mesma ordem em que foram
         * digitados, indicando o índice de cada um.
         */

        Scanner scanner = new Scanner(System.in);

        int[] nomes = new int[8];
        int cont = 0;

        while (cont < nomes.length) {
            System.out.print("Informe um valor inteiro: ");
            nomes[cont] = scanner.nextInt();
            cont++;
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Indice: %d -> Nome: %s\n", i, nomes[i]);

        }

        scanner.close();
    }
}
