import java.util.Scanner;

public class Ex34TabuleiroAlternado {
    public static void main(String[] args) {
        /*
         * 34. Tabuleiro alternado
         * Leia um tamanho n e desenhe um tabuleiro de asteriscos e espacos alternados.
         * A cada linha, alterne o primeiro caractere para produzir o padrao de xadrez.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do tabuleiro: ");
        int tamanho = scanner.nextInt();

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if ((i + j)% 2 == 0) {
                    System.out.print("* ");
                } else { 
                    System.out.print("  ");

                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
