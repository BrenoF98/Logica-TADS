import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrizA = new int[3][4];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrizA.length; i++) { // m.length -> QUANT DE LINHAS
            for (int j = 0; j < matrizA[i].length; j++) { // m[i].length -> Quantidades de colunas
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
