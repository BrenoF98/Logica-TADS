package Prova3;
import java.util.Scanner;

public class Ex1OcorrenciasDeXOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * 1. Leia um vetor de 12 números inteiros. ok
         * 
         * solicite ao usuario um valor X.
         * 
         * O programa deve apresentar todos os indices em que X aparece e informar a
         * quantidade total de ocorrencias.
         * 
         * Caso não exista, apresente uma mensagem apropriada.
         */

        // inicializa o vetor de tamanho 12 e solicita ao usuario seus elementos.
        System.out.println("Informe 12 valores inteiros para o vetor A");
        int[] vetor_A = new int[12];
        for (int i = 0; i < vetor_A.length; i++) {
            vetor_A[i] = scanner.nextInt();
        }
        // inicializa e solicitar o valor X a ser comparado.
        System.out.println("Informe um valor inteiro X: ");
        int X = scanner.nextInt();

        int[] vetor_Idx_A = new int[1]; // inicializa vetor para armazenar os indices de ocorrencias de X.

        int quantIncX = 0; // inicializa contador para as ocorrencia de X

        int[] vetor_Idx_A_Copia; // inicializa o vetor copia para a logica de copia

        for (int i = 0; i < vetor_A.length; i++) { // percorre Vetor A

            if (vetor_A[i] == X) { // se X = ao elemento i

                vetor_Idx_A[vetor_Idx_A.length - 1] = i; // vetor de indices armazena indice corresponde.
                vetor_Idx_A_Copia = vetor_Idx_A;
                vetor_Idx_A = new int[vetor_Idx_A.length + 1];
                quantIncX++; // conta a ocorrencia

                for (int j = 0; j < vetor_Idx_A.length - 1; j++) {
                    vetor_Idx_A[j] = vetor_Idx_A_Copia[j];
                }

            }
        }

        if (quantIncX == 0) {
            System.out.println("Nenhum elemento é igual a " + X);
        } else {

            System.out.print("\n\nIndices em que o valor " + X + " aparece: {");
            for (int i = 0; i < vetor_Idx_A.length - 1; i++) {

                System.out.printf(" %d", vetor_Idx_A[i]);
            }
            System.out.printf(" }\nQuantidade de ocorrencias de %d: %d", X, quantIncX);
        }

        scanner.close();

    }
}
