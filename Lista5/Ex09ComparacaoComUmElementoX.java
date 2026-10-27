package Lista5;

import java.util.Scanner;

public class Ex09ComparacaoComUmElementoX {
    public static void main(String[] args) {
        /*
         * Exercício 9 — Comparação com um elemento
         * 
         * Leia um vetor de 15 números inteiros e, em seguida, solicite ao usuário um
         * índice válido do vetor.
         * 
         * Utilize o valor armazenado nesse índice como referência e apresente quantos
         * elementos do vetor são maiores, menores ou iguais a ele.
         * 
         * Inclua o próprio elemento de referência na contagem dos iguais.
         */
        Scanner scanner = new Scanner(System.in);

        int[] vetorInt = new int[15];

        int idx, contMaior = 0, contMenor = 0, contIgual = 0;

        for (int i = 0; i < vetorInt.length; i++) {
            System.out.printf("Informe um valor inteiro: ");
            vetorInt[i] = scanner.nextInt();
        }

        boolean valorValidoIdx = false;
        do {
            System.out.println("Informe um índice válido do vetor");
            idx = scanner.nextInt();
            if (idx >= 0 && idx < vetorInt.length) {
                valorValidoIdx = true;
            }
        } while (!valorValidoIdx);

        for (int i = 0; i < vetorInt.length; i++) {
            if (vetorInt[i] > vetorInt[idx]) {
                contMaior++;
            } else if (vetorInt[i] < vetorInt[idx]) {
                contMenor++;
            } else if (vetorInt[i] == vetorInt[idx]) {
                contIgual++;
            }
        }

        System.out.printf("""
            
             Maior....: %d
             Menor....: %d
             Iguais...: %d
             
        """, contMaior, contMenor, contIgual);
        

        scanner.close();
    }
}
