package Lista5;

import java.util.Scanner;

public class Ex34IntersecaoDeDoisVetores {
    public static void main(String[] args) {
        /*
         * Exercício 34 — Interseção de dois vetores
         * Leia dois vetores contendo 10 números inteiros cada.
         * 
         * Crie um terceiro vetor contendo somente os valores presentes em ambos os
         * vetores, sem repetições.
         * 
         * Os elementos deverão aparecer na ordem de sua primeira ocorrência no primeiro
         * vetor.
         */
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 10 Valores inteiro para o primeiro vetor.");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Informe 10 Valores inteiro para o segundo vetor.");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int[] vetor3 = new int[0];
        int[] vetorCopia = new int[0];

        for (int i = 0; i < vetor1.length; i++) {

            for (int j = 0; j < vetor2.length; j++) {
                boolean podeAdd = true;
                if (vetor1[i] == vetor2[j]) {

                    for (int j2 = 0; j2 < vetor3.length; j2++) {

                        podeAdd = vetor3[j2] != vetor1[i];

                    }
                    if (podeAdd) {

                        vetorCopia = vetor3;
                        vetor3 = new int[vetor3.length + 1];

                        for (int j3 = 0; j3 < vetorCopia.length; j3++) {
                            vetor3[j3] = vetorCopia[j3];
                        }
                        vetor3[vetor3.length - 1] = vetor1[i];
                        podeAdd = false;
                    }
                }

            }
        }

        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i] + " ");
        }

        scanner.close();

    }
}
