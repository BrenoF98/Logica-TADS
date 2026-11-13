import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] m = new int[10][10];
        char[] colunaIndice = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
        while (true) {
            
            System.out.print("\033[H\033[2J");
            System.out.println();
            
            System.out.print("     ");
            for (int j = 0; j < colunaIndice.length; j++) {
                System.out.print(" " + colunaIndice[j]);
            }
            System.out.println();
            
            for (int i = 0; i < m.length; i++) { // 10
                
                System.out.printf("%02d | ", i);
                int soma = 0;
                for (int j = 0; j < m.length; j++) { // 100
                    System.out.printf("%2d", m[i][j]); // 100
                    soma += m[i][j];
                }
                System.out.print("  | Soma = " + soma); // 10
                System.out.println(); // 10
            }
            System.out.println();
            System.err.println("informe uma linha, uma coluna e um valor inteiro: ");
            int linha = scanner.nextInt();
            char coluna = scanner.next().charAt(0);
            int valor = scanner.nextInt();
            m[linha][coluna - 65] = valor; // A -> 65
        }
    }
}
