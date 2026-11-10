package Prova3;
import java.util.Scanner;

public class EX3IntersecaoSemRepetir {
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

            for (int j = 0; j < vetor_C.length && !igual; j++) {
                // o valor ai esta no vetor c?
                igual = vetor_A[i] == vetor_C[j];
            }

            if (igual) {

                vetor_C[vetor_C.length - 1] = vetor_A[i]; // vetor de indices armazena indice corresponde.
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
