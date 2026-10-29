public class UniaoOrdenada {
    public static void main(String[] args) {

        // DADOS DOIS VETORES ORDENADOS
        // CRIAR UM UNICO VETOR ORDENADO
        /*
         * v1 = {1, 4, 6}
         * v2 = {2, 4, 5}
         * saida = {1, 2, 4, 4, 5, 6}
         * 
         * Regras:
         * 
         * Não pode ter for dentro de for.
         * Não pode ordenar o vetor resultante depois.
         */

        int[] v1 = { 1, 4, 6 }, v2 = { 2, 4, 5 };
        int[] saida = new int[v1.length + v2.length];
        int idxV1 = 0, idxV2 = 0;

        for (int i = 0; i < saida.length; i++) {
            if (idxV1 < v1.length && idxV2 < v2.length) {
                if (v1[idxV1] <= v2[idxV2]) {
                    saida[i] = v1[idxV1];
                    idxV1++;
                } else {
                    saida[i] = v2[idxV2];
                    idxV2++;
                }
            } else if (idxV2 >= v2.length) {
                saida[i] = v1[idxV1];
                idxV1++;
            } else {
                saida[i] = v2[idxV2];
                idxV2++;
            }

            System.out.print("Saída = { ");
            for (int j = 0; j < saida.length; j++) {
                if (j != saida.length - 1) {
                    System.out.printf("%d,", saida[j]);
                } else {
                    System.out.printf("%d", saida[j]);
                }
            }
            System.out.println(" }");

        }

        System.out.print("Saída Final = { ");
        for (int i = 0; i < saida.length; i++) {
            if (i != saida.length - 1) {
                System.out.printf("%d,", saida[i]);
            } else {
                System.out.printf("%d", saida[i]);
            }
        }
        System.out.println(" }");

    }
}
