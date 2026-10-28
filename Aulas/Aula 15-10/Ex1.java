import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /* Vetores // array -> Estrutura de dados */

        // array <=> vetor

        // declaração de um vetor.
        int[] valores;

        // inicialização de um vetor.

        valores = new int[10]; // vetor iniciado com tamanho 10.

        // ou

        // declaração e inicialização na mesma linha.
        //int[] v2 = new int[10];

        // valores [0] = scanner.nextInt(); escreve o valor na posição 0;

        for (int i = 0; i < valores.length; i++) { // velores.length le o tamanho do vetor.
            valores[i] = scanner.nextInt(); // escreve na posição i
        }

        System.err.println(valores[0]);

        // não existe
        // valores = sc.nextInt(); uma atribuição conjunta de valores.

        // apenas C é vetor

        //int a, b, c [];

        // d, e, f são vetores. 

        //int [] d, e, f; 


        scanner.close();
    }
}
