package Lista5;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Exercício 12 — Busca com múltiplas ocorrências
         * Leia um vetor de 12 números inteiros. Solicite ao usuário um valor X.
         * 
         * O programa deverá apresentar todos os índices em que X aparece e informar a
         * quantidade total de ocorrências. Caso não exista, apresente uma mensagem
         * apropriada.
         */
        // lê uma quantidade N de numeros inteiros e armezena em um vetor: 

        System.out.print("informe a quantidade de elementos para o vetor: "); 
        int quantNum = scanner.nextInt();
        int [] vetor_A = new int [quantNum];
        System.out.println("Informe " + quantNum + " inteiros: ");
        for (int i = 0; i < quantNum; i++) {
            vetor_A [i]= scanner.nextInt();
        }

        System.out.print("Informe um número inteiro X: ");
        int X = scanner.nextInt();
        

        int quantRep = 0;


        for (int i = 0; i < vetor_A.length; i++) {
            if (vetor_A[i] == X) {
                quantRep++;
                System.out.println("Ocorrência " + quantRep + " no índice " + i);
            } 
        }

        if (quantRep == 0) {
            System.out.println("Não houve incidencia de " + X + " no Vetor.");
        } else { 
            System.out.println("A quantidade total de incidencias é: " + quantRep);
        }
        scanner.close();

    }
}
