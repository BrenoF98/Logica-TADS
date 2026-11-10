package Lista5;

import java.util.Scanner;

public class Ex10MultiplosDeUmNumero {
    public static void main(String[] args) {
        /*
         * Exercício 10 — Múltiplos de um número

         * Leia 12 números inteiros e armazene-os em um vetor. Em seguida, solicite ao
         * usuário um número inteiro X, diferente de zero.
         * 
         * Apresente todos os valores do vetor que são múltiplos de X, juntamente com
         * seus índices. Ao final, informe a quantidade encontrada.
         */
        int[] vetor1 = new int[12];
        int X;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 12 Valores inteiro para o vetor.");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = scanner.nextInt();
        }
        do {
            
            System.out.println("Informe um valor inteiro X diferente de zero: ");
            X = scanner.nextInt();

            if (X > 0 || X < 0) {
                break;
            } else {
                System.out.println("Erro! Informe um valor valido");
            }

        } while (true); 

        
        scanner.close();
         
    }
}
