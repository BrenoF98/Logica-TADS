package Prova3;

import java.util.Scanner;

public class Ex8copy {
    public static void main(String[] args) {
        /*
         * Exercício 08. Leia um vetor contendo 15 números inteiros, permitindo valores
         * repetidos. Elimine as ocorrências duplicadas, preservando somente a primeira
         * ocorrência de cada valor e mantendo a ordem original. A operação deverá ser
         * realizada no próprio vetor, deslocando os elementos quando necessário.
         * Exemplo:
         * 
         * Original: [5, 2, 5, 3, 2, 8, 3]
         * 
         * Resultado: [5, 2, 3, 8]
         */
        Scanner scanner = new Scanner(System.in);

        // Leia um vetor contendo 15 números inteiros, permitindo valores repetidos.
        int[] vetor_A = new int[15];
        System.out.println("Informe 15 números inteiros: ");
        for (int i = 0; i < vetor_A.length; i++) {
            vetor_A[i] = scanner.nextInt();
        }

        // tamanho indica quantas posições do vetor ainda são válidas.
        // O vetor em si não encolhe, apenas o "tamanho útil" diminui.
        int tamanho = vetor_A.length;

        int i = 1; // o elemento da posição 0 nunca é repetido.
        while (i < tamanho) {

            // O valor da posição i já apareceu antes (posições 0 até i - 1)?
            boolean repetido = false;
            for (int j = 0; j < i && !repetido; j++) {
                repetido = vetor_A[i] == vetor_A[j];
            }

            if (repetido) {
                // Desloca os elementos seguintes uma posição para a esquerda,
                // sobrescrevendo a posição i.
                for (int k = i; k < tamanho - 1; k++) {
                    vetor_A[k] = vetor_A[k + 1];
                }
                tamanho--;
                // i não avança: um novo valor ocupa a posição i e ainda não foi verificado.
            } else {
                i++;
            }
        }

        System.out.println("Vetor sem repetição e em ordem original: ");
        System.out.print("{ ");
        for (int k = 0; k < tamanho; k++) {
            if (k == tamanho - 1) {
                System.out.print(vetor_A[k] + " ");
            } else {
                System.out.print(vetor_A[k] + ", ");
            }
        }
        System.out.println("}");

        scanner.close();
    }
}