package Lista5;

import java.util.Scanner;

public class Ex05ContagemDeParesEImpares {
    public static void main(String[] args) {
        /*
         * Exercício 5 — Contagem de pares e ímpares
         * Leia 12 números inteiros e armazene-os em um vetor.
         * 
         * Apresente a quantidade de números pares e ímpares. Em seguida, exiba primeiro
         * todos os valores pares e depois todos os ímpares, preservando a ordem
         * original de cada grupo.
         */
        Scanner scanner = new Scanner(System.in);

        int[] v1 = new int[12];

        int contPar = 0, idxPar = 0, contImpar = 0, idxImpar = 0;

        for (int i = 0; i < v1.length; i++) {
            System.out.printf("Informe um valor inteiro: \n", i);
            v1[i] = scanner.nextInt();

            if (v1[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        int[] v1Par = new int[contPar];
        int[] v1Impar = new int[contImpar];

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] % 2 == 0) {
                v1Par[idxPar] = v1[i];
                idxPar++;
            } else {
                v1Impar[idxImpar] = v1[i];
                idxImpar++;

            }
        }

        // Mosta vetor Par
        System.out.printf("Quantidade de valores Par: %d \nVetor Valores Par = {", contPar);
        for (int i = 0; i < v1Par.length; i++) {

            if (i != v1Par.length - 1) {
                System.out.printf("%d, ", v1Par[i]);
            } else {
                System.out.printf("%d", v1Par[i]);

            }
        }
        System.out.printf("}\n");

        // Mosta vetor Impar
        System.out.printf("\n\nQuantidade de valores Impar: %d \nVetor Valores Impar = {", contPar);
        for (int i = 0; i < v1Impar.length; i++) {

            if (i != v1Impar.length - 1) {
                System.out.printf("%d, ", v1Impar[i]);
            } else {
                System.out.printf("%d", v1Impar[i]);

            }
        }
        System.out.printf("}\n");

        scanner.close();
    }
}
