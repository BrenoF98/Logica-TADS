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

        int [] v1 = {1, 4, 6}, v2 = {2, 4, 5};

        int tamanhoSaida = v1.length + v2.length;

        int contIdxV1 =0, contIdxV2 =0; 
        
        int [] saida = new int[tamanhoSaida];

        for (int i = 0; i < saida.length; i++) {
            if (contIdxV1 == v1.length) break;
            saida[i] = v1 [contIdxV1];
            contIdxV1++;

        }


    }
}
