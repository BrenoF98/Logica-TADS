package Lista5;

import java.util.Scanner;

public class Ex07ExibicaoEmOrdemInversa {
    public static void main(String[] args) {



        /*
         * Exercício 7 — Exibição em ordem inversa
         * Leia 10 números inteiros e armazene-os em um vetor.
         * 
         * Apresente os valores na ordem inversa à leitura, sem modificar o conteúdo do
         * vetor original e sem criar outro vetor.
         */

        
        Scanner scanner = new Scanner(System.in);
        
        
        int[] vetorValores = new int[10];
        
        //int[] vetorInverso = new int[vetorValores.length];
        
        for (int i = 0; i < vetorValores.length; i++) {
            System.out.print("Informe um valor inteiro: ");
            vetorValores[i] = scanner.nextInt();
        }
        
       /*  int idxInverso = vetorValores.length - 1;
        for (int i = 0; i < vetorValores.length; i++) {
            vetorInverso[idxInverso] = vetorValores[i];
            idxInverso--;
        }
        
        // imprime o vetor de forma matematica.
        
        System.out.printf("\nVetor Inverso = {");
        for (int i = 0; i < vetorInverso.length; i++) { // perco o vetor.
            
            if (i != vetorInverso.length - 1) { // se não for o ultimo elemento do vetor
                System.out.printf("%d, ", vetorInverso[i]);
            } else { // se for o ultimo elemento
                System.out.printf("%d", vetorInverso[i]);
                
            }
        }
        System.out.printf("}\n"); */

        // imprime o vetor de forma matematica.
        
        System.out.printf("\nVetor Inverso = {");
        for (int i = vetorValores.length - 1; i >= 0; i--) { // perco o vetor.
            
            if (i != 0) { // se não for o ultimo elemento do vetor
                System.out.printf("%d, ", vetorValores[i]);
            } else { // se for o ultimo elemento
                System.out.printf("%d", vetorValores[i]);
                
            }
        }
        System.out.printf("}\n");
        
        scanner.close();
    }
}
