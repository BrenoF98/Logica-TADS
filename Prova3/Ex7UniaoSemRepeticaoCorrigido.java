package Prova3;

import java.util.Scanner;

public class Ex7UniaoSemRepeticaoCorrigido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * 7. Leia dois vetores A e B. Cada um contem 10 números inteiros.OK
         * 
         * Crie um Terceiro, vetor C, OK
         * 
         * que represente a uniao de A e B sem elementos
         * repetidos. Os valores devem aparecer em C na ordem de sua primeira
         * ocorrencia, todos de A e depois os de B.
         * 
         */

        // le vetor A e B.

        System.out.print("Informe 10 números inteiros para compor o Vetor_A: ");
        int[] vetor_A = new int[10];

        for (int i = 0; i < vetor_A.length; i++) {

            vetor_A[i] = scanner.nextInt();

        }
        System.out.print("Informe 10 números inteiros para compor o Vetor_B: ");
        int[] vetor_B = new int[10];

        for (int i = 0; i < vetor_B.length; i++) {

            vetor_B[i] = scanner.nextInt();

        }

        /*
         * int[] vetor_A = { 1, 2, 3, 4, 5 };
         * int[] vetor_B = { 4, 5, 6, 7, 8 };
         */

        // Cria vetor C.
        int[] vetor_C;
        // vetor para logica vetor modular
        int[] vetor_C_Copia;

        // vetor c Assume todos os valores de A e posteriormente adicionaremos todos que
        // não estão em A mas estão em B.

        vetor_C = new int[vetor_A.length + 1];

        for (int k = 0; k < vetor_C.length - 1; k++) {
            vetor_C[k] = vetor_A[k];
        }

        for (int i = 0; i < vetor_B.length; i++) {
            boolean diferete = false;
            for (int j = 0; j < vetor_A.length && !diferete; j++) {
                diferete = vetor_A[j] == vetor_B[i];

            }

            for (int j = 0; j < vetor_C.length && !diferete; j++) {
                // o valor ai esta no vetor c?
                diferete = vetor_C[j] == vetor_B[i];
            }

            if (!diferete) {

                vetor_C[vetor_C.length - 1] = vetor_B[i]; // vetor de indices armazena indice corresponde.
                vetor_C_Copia = vetor_C;
                vetor_C = new int[vetor_C.length + 1];

                for (int k = 0; k < vetor_C.length - 1; k++) {
                    vetor_C[k] = vetor_C_Copia[k];
                }
            }

        }

        for (int i = 0; i < vetor_C.length - 1; i++) {
            System.out.print(vetor_C[i] + " ");
        }

        scanner.close();
    }
}
