package Lista5;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Exercício 13 — Consulta de posições
         * Leia um vetor de 10 números inteiros.
         * 
         * Depois da leitura, permita que o usuário consulte repetidamente uma posição
         * do vetor, exibindo seu valor. O programa deverá terminar quando o usuário
         * informar -1.
         * 
         * Posições fora do intervalo válido devem produzir uma mensagem de erro, sem
         * encerrar o programa.
         */

        // lê uma quantidade N de numeros inteiros e armezena em um vetor:

        System.out.print("informe a quantidade de elementos para o vetor: ");
        int quantNum = scanner.nextInt();
        int[] vetor_A = new int[quantNum];
        System.out.println("Informe " + quantNum + " inteiros: ");
        for (int i = 0; i < quantNum; i++) {
            vetor_A[i] = scanner.nextInt();
        }

        int idx;

        do {
            System.out.println("informe uma posição para ser consultada: ");
            idx = scanner.nextInt();
            if (idx == -1) {
                System.out.println("programa finalizado! ");
                break;
            }

            if (idx < 0 || idx > vetor_A.length - 1) {
                System.out.println("Não é um valor valido!");
                System.out.printf("Valores validos são de 0 a %d\n", vetor_A.length - 1);
                continue;
            } else {
                System.out.println("A posição " + idx + " guarda o número " + vetor_A[idx]);
            }

        } while (true);

        scanner.close();
    }
}
