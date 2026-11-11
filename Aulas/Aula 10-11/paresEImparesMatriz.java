import java.util.Scanner;

public class paresEImparesMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contImpar = 0, contPar = 0;
        int[][] matrizA = new int[3][4];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("informe um valor para %d,%d: ", i,j);
                matrizA[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Matiz completa: ");
        for (int i = 0; i < matrizA.length; i++) { // m.length -> QUANT DE LINHAS
            for (int j = 0; j < matrizA[i].length; j++) { // m[i].length -> Quantidades de colunas
                System.out.printf("%4d", matrizA[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < matrizA.length; i++) { // m.length -> QUANT DE LINHAS
            for (int j = 0; j < matrizA[i].length; j++) { // m[i].length -> Quantidades de colunas
                if (matrizA[i][j] % 2 == 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            }
        }

        System.out.println("Quantidade de pares: " + contPar);
        System.out.println("Quantidade de impares: " + contImpar);

        System.out.println("Pares: ");
        for (int i = 0; i < matrizA.length; i++) { // m.length -> QUANT DE LINHAS
            for (int j = 0; j < matrizA[i].length; j++) { // m[i].length -> Quantidades de colunas
                if (matrizA[i][j] % 2 == 0) {
                    System.out.printf("%4d", matrizA[i][j]);
                } else {
                    System.out.print("   / ");
                }
            }
            System.out.println();

        }

        System.out.println("\n impares: ");
        for (int i = 0; i < matrizA.length; i++) { // m.length -> QUANT DE LINHAS
            for (int j = 0; j < matrizA[i].length; j++) { // m[i].length -> Quantidades de colunas
                if (matrizA[i][j] % 2 != 0) {
                    System.out.printf("%4d", matrizA[i][j]);
                } else {
                    System.out.print("   / ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
