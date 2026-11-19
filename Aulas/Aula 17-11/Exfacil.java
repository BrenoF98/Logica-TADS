
public class Exfacil {
    public static void main(String[] args) {

        // inicia uma matriz de qualquer tamanho retangular

        int[][] m1 = {
                { 2, 4, 4, 2 },
                { 1, 3, 3, 1 },

        };

        int[][] t1 = new int[m1[0].length][m1.length];

        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                t1[i][j] = m1[j][i];
            }
            System.out.println();
        }

        System.out.println("\nMatriz m1: ");

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.printf(" %3d", m1[i][j]);

            }
            System.out.println();
        }
        System.out.println("\nMatriz transposta t1: ");
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                System.out.printf(" %3d", t1[i][j]);
            }
            System.out.println();
        }

        int[][] multMxT = new int[m1.length][t1[0].length];

        for (int i = 0; i < multMxT.length; i++) { // percorre as linhas ma matriz resultado
            for (int j = 0; j < multMxT[0].length; j++) { // percorre as colunas da matriz resultado
                for (int k = 0; k < t1.length /* ou m1.length */; k++) { // percorre linha e coluna das matrizes m1 e t1.
                    multMxT[i][j] += m1[i][k] * t1[k][j];
                }
            }
        }
        System.out.println("\nMatriz resultado m1xt1: ");
        for (int i = 0; i < multMxT.length; i++) {
            for (int j = 0; j < multMxT[0].length; j++) {
                System.out.printf(" %3d", multMxT[i][j]);
            }
            System.out.println();
        }

    }
}
