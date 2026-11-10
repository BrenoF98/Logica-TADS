import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrizA = new int[3][3];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print(matrizA [i][j] + " ");
                if ((j + 1) % 3 == 0) {
                   System.out.println(); 
                }
            }
        }

        scanner.close();
    }
}
