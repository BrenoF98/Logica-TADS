package Lista5;

import java.util.Scanner;

public class Ex08MaiorEMenorElemento {
    public static void main(String[] args) {
        /*
         * Exercício 8 — Maior e menor elemento
         * Leia um vetor contendo 10 números inteiros.
         * 
         * Determine o maior e o menor valor armazenado, apresentando também o índice da
         * primeira ocorrência de cada um.
         */
        Scanner scanner = new Scanner(System.in);
        int[] vetorValores = new int[10];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        int idxMaior = -1, idxMenor = -1;

        // int[] vetorInverso = new int[vetorValores.length];

        for (int i = 0; i < vetorValores.length; i++) {
            System.out.print("Informe um valor inteiro: ");
            vetorValores[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorValores.length; i++) {
            if (vetorValores[i] > maior) {
                maior = vetorValores[i];
                idxMaior = i;
            }

            if (vetorValores[i] < menor) {
                menor = vetorValores[i];
                idxMenor = i;
            }
        }

        System.out.printf("""

                    Maior....................................: %d
                    Indice da primeira incidencia do maior...: %d
                    Menor....................................: %d
                    Indice da primeira incidencia do menor...: %d

                """, maior, idxMaior, menor, idxMenor);

        scanner.close();
    }
}
