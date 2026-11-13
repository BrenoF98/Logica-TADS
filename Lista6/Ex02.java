package Lista6;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrizA;

        boolean linhasOK = false, colunasOK = false;
        int linhasL = 0, colunasC = 0;

        do {
            // solicita quantidade de colulas e linhas entre 1 e 10
            if (!linhasOK) {

                System.out.print("Informe a quantidade de Linhas L: ");
                linhasL = scanner.nextInt();
                if (linhasL < 1 || linhasL > 10) {
                    System.out.println("Valor invalido, escolha entre 1 a 10 Linhas");
                    continue;
                } else {
                    linhasOK = true;
                }
            }

            if (!colunasOK) {

                System.out.print("Informe a quantidade de Colunas C: ");
                colunasC = scanner.nextInt();
                if (colunasC < 1 || colunasC > 10) {
                    System.out.println("Valor invalido, escolha entre 1 a 10 Colunas");
                    continue;
                } else {
                    colunasOK = true;
                }
            }

            if (linhasOK && colunasOK)
                break;

        } while (true);

        matrizA = new int[linhasL][colunasC];

        // matriz preenchida linha por linha.

        System.out.println("Matriz preenchida linha por lina: ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (matrizA[i].length * i) + j + 1;
                System.out.printf("%02d ", matrizA[i][j]);
            }
            System.out.println();
        }

        // matriz preenchida coluna por coluna

        System.out.println();
        System.out.println("Matriz preenchida coluna por coluna: ");

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (matrizA.length * j) + i + 1;
                System.out.printf("%02d ", matrizA[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}