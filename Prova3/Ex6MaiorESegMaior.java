package Prova3;
import java.util.Scanner;

public class Ex6MaiorESegMaior {
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
        int[] vetor_A = new int[15];
        int maior = Integer.MIN_VALUE, segMaior = Integer.MIN_VALUE, anterior = Integer.MIN_VALUE;

        System.out.println("Informe 15 valores inteiros: ");
        for (int i = 0; i < vetor_A.length; i++) {
            vetor_A[i]= scanner.nextInt();
        }

        for (int i = 0; i < vetor_A.length; i++) {
            if (vetor_A[i] > maior) {
                anterior = maior;
                maior = vetor_A[i];
            }
            if (maior > segMaior && segMaior < anterior) {
                segMaior = anterior;
            }
            
        }

        
        System.out.println("Maior: " + maior);
        if (segMaior == Integer.MIN_VALUE) {
            System.out.println("Não existe Segundo Maior");
        } else System.out.println("Segundo Maior: " + segMaior);
        
        
        scanner.close();
    }
}
