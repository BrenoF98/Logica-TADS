public class vetorDeVetor {
    public static void main(String[] args) {

        int[] vetor = { 1, 2, 3, 4, 5 };

        int[][] matriz = new int[8][8];

        int[][] m = {
                { 10, 20, 30, 40 },
                { 35, 2, 4, 8 },
                { 1, 3, 5, 7 }
        };

        // NO NOSSO CASO A LEITURA sempre será linhas depois colulas.

        /*
         * Quando usar matriz?
         * 
         * A pergunta é:
         * 
         * Esse problema é UNIDIMENCIONAL OU MULTIDIMENCIAL?
         */
        int matrizA[][] = {
                { 1, 2, 3 }, 
                { 4, 5, 6 }, 
                { 7, 8, 9 }
        };

        for (int i = 0; i < matrizA.length; i++) { // m.length -> QUANT DE LINHAS
            for (int j = 0; j < matrizA[i].length; j++) { // m[i].length -> Quantidades de colunas
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
    }
}
