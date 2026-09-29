import java.util.Scanner;

public class Ex6SequenciaNúmero {
    public static void main(String[] args) {
        /*
         * 6. Sequencia numerica
         * Leia um inteiro positivo n e apresente os n primeiros termos da sequencia 2,
         * 5, 8, 11.... Ao final, informe a soma dos termos.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número n inteiro e positivo: ");
        int numeroN = scanner.nextInt();

        int elementos = 2;

        int soma = 0;

        for (int i = 1; i <= numeroN; i++) {
            System.out.printf("\nElemento %d -> %d\n", i, elementos);
            soma += elementos;
            elementos += 3;
        }

        System.out.printf("\nA soma dos %d elementos da sequencia é: %d\n", numeroN, soma);
        
        scanner.close();
    }
}
