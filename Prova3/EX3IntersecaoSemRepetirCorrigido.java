package Prova3;
import java.util.Scanner;

public class EX3IntersecaoSemRepetirCorrigido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * 3. Leia dois vetores contendo 10 números inteiros cada. ok
         * 
         * Crie um terceito vetor contendo somente os valores presentes em ambos os
         * vetores, sem repetições. ok
         * 
         * Os elementos deverão ser apresentados na ordem de usa primeira ocorrencia no
         * primeiro vetor. ok
         */

        // lé 10 elementos para cada vetor.

        /* System.out.print("Informe 10 números inteiros para compor o Vetor_A: ");
        int[] vetor_A = new int[10];

        for (int i = 0; i < vetor_A.length; i++) {

            vetor_A[i] = scanner.nextInt();

        }
        System.out.print("Informe 10 números inteiros para compor o Vetor_B: ");
        int[] vetor_B = new int[10];

        for (int i = 0; i < vetor_B.length; i++) {

            vetor_B[i] = scanner.nextInt();

        } */

        int[] vetor_A = {5, 3, 8, 3, 1, 0};
        int[] vetor_B = {2, 3, 5, 9, 5, 0};

        // Crie um terceito vetor contendo somente os valores presentes em ambos os
        // vetores, sem repetições

        int[] vetor_C = new int[1];
        int[] vetor_C_Copia; // vetor para logica vetor modular.

        for (int i = 0; i < vetor_A.length; i++) {
            boolean igual = false;
            for (int j = 0; j < vetor_B.length && !igual; j++) {
                // o valor ai esta no vetor b?
                igual = vetor_A[i] == vetor_B[j];
            }

            for (int k = 0; k < vetor_C.length - 1 && igual; k++) {
                // o valor não esta em C?
                igual = vetor_A[i] != vetor_C[k];
            }

            if (igual) {

                vetor_C[vetor_C.length - 1] = vetor_A[i]; // vetor de indices armazena indice corresponde.
                vetor_C_Copia = vetor_C;
                vetor_C = new int[vetor_C.length + 1];

                for (int l = 0; l < vetor_C.length - 1; l++) {
                    vetor_C[l] = vetor_C_Copia[l];
                }
            }
        }

        for (int i = 0; i < vetor_C.length - 1; i++) {
            System.out.print(vetor_C[i] + " ");
        }

        scanner.close();
    }
}
