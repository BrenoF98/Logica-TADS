package Prova3;

import java.util.Scanner;

public class Ex6MaiorESegMaiorCorrigido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Leia um vetor com 15 números inteiros. ok
         * 
         * Determine o Maior eo segundo maior valor distinto do vetor, sem ordenar seus
         * elementos.
         * 
         * Caso todos senham igual informe que não existe um segundo maior valor
         * distinto.
         * 
         */
        int[] vetor_A = {5,9,3,9,7,5};
        int maior = vetor_A[0];
        int segMaior = 0;

        Boolean temSeg = false;

        /* System.out.println("Informe 15 valores inteiros: ");
        for (int i = 0; i < vetor_A.length; i++) {
            vetor_A[i] = scanner.nextInt();
        } */
        


        for (int i = 1; i < vetor_A.length; i++) {
            
            if (vetor_A[i] > maior) {
                segMaior = maior;
                maior = vetor_A[i];
                temSeg =  true;
            } else if (vetor_A[i] < maior && (!temSeg || vetor_A[i] > segMaior)) {
                segMaior = vetor_A[i];
                temSeg = true;
            }

        }

        System.out.println("Maior: " + maior);
        if (temSeg) {
            System.out.println("Segundo Maior: " + segMaior);
        } else {System.out.println("Não existe Segundo Maior");}
            

        scanner.close();
    }
}
