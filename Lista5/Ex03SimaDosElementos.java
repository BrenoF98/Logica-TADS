package Lista5;

import java.util.Scanner;

public class Ex03SimaDosElementos {
    public static void main(String[] args) {
        /*
         * Exercício 3 — Soma dos elementos
         * 
         * Leia 10 números inteiros, armazene-os em um vetor e calcule a soma de todos
         * os elementos.
         * 
         * Apresente o vetor completo e o resultado da soma.
         */
        Scanner scanner = new Scanner(System.in);

        int[] vetorValores = new int[10];
        int somaVetorValores = 0;

        for (int i = 0; i < vetorValores.length; i++) {
            System.out.printf("Informe um valor inteiro para o indice %d: \n", i);
            vetorValores[i] = scanner.nextInt();
        }

        System.out.printf("Vetor Valores = {");
        for (int i = 0; i < vetorValores.length; i++) {
            somaVetorValores += vetorValores[i];
            if (i != vetorValores.length - 1) {
                System.out.printf("%d, ", vetorValores[i]);
            } else {
                System.out.printf("%d", vetorValores[i]);

            }
        }
        System.out.printf("}\n");
        
        System.out.println("Soma dos valores de vetor valores: " + somaVetorValores);

        scanner.close();
    }
}
