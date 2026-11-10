package Prova3;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        /*
         * 1º: Exercício 08
         * 
         * Exercício 08. Leia um vetor contendo 15 números inteiros, permitindo valores
         * repetidos. Elimine as ocorrências duplicadas, preservando somente a primeira
         * ocorrência de cada valor e mantendo a ordem original. A operação deverá ser
         * realizada no próprio vetor, deslocando os elementos quando necessário.
         * Exemplo:
         * 
         * Original: [5, 2, 5, 3, 2, 8, 3]
         * 
         * Resultado: [5, 2, 3, 8]
         * 
         * É o mais difícil porque exige deslocar elementos dentro do próprio vetor, sem
         * criar um vetor auxiliar. Isso é diferente do que você fez nos outros
         * exercícios, onde construía um vetor novo.
         */
        Scanner scanner = new Scanner(System.in);

        // Leia um vetor contendo N números inteiros, permitindo valores repetidos.
        System.out.print("!nforme o tamanho do vetor: ");
        int tamVetor = scanner.nextInt();
        
         int [] vetor_A = new int[tamVetor];
         System.out.println("Informe " + tamVetor + " números inteiros: ");
         for (int i = 0; i < vetor_A.length; i++) {
         vetor_A[i] = scanner.nextInt();
         }

        // ++++++++++++++

        // Elimine as ocorrências duplicadas, preservando somente a primeira
        // ocorrência de cada valor e mantendo a ordem original. A operação deverá ser
        // realizada no próprio vetor, deslocando os elementos quando necessário.
        int tamanho =  vetor_A.length;
        int i = 1;

        while (i < tamanho) { // percorre todo o vetor A.
            boolean repetido = false;
            for (int j = 0 ; j < i && !repetido; j++) {
                repetido = vetor_A[i] == vetor_A[j];
            }
            if (repetido) {
                for (int k = i; k < tamanho - 1; k++) {
                    vetor_A[k] = vetor_A[k + 1]; 
                }
                tamanho--;
            } else { 
                i++;
            }
        
        }
        

        System.out.println("Vetor sem repetição e em ordem original: ");
        System.out.print("{ "); 
        for (int k = 0; k < tamanho; k++) {
            if (k == tamanho  - 1) {
                System.out.print(vetor_A[k] + " ");
            } else {
                System.out.print(vetor_A[k] + ", ");
            }
        }
        System.out.println("}");

        scanner.close();
    }
}
