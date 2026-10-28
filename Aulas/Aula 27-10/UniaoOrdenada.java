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

        int tamanhoSaida = v1.length + v2.length;

        int idxV1 = 0, idxV2 = 0;

        int[] saida = new int[tamanhoSaida];

        for (int i = 0; i < saida.length; i++) {

            if (v1[idxV1] >= v2[idxV2]) {
                saida[i] = v1[idxV1];
                idxV1++;
            }

        }

    }
}
