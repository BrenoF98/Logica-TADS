package Lista5;

public class Ex33UniaoDeDoisVetores {
    public static void main(String[] args) {
        /*
         * Exercício 33 — União de dois vetores
         * Leia dois vetores A e B, cada um contendo 10 números inteiros.
         * 
         * Crie um terceiro vetor C que represente a união dos dois conjuntos de
         * valores, sem elementos repetidos.
         * 
         * Os valores devem aparecer em C na ordem de sua primeira ocorrência:
         * inicialmente os de A e depois os valores ainda não presentes de B.
         * 
         * Exemplo:
         */

        int[] vetor_A = { 1, 4, 8, 9, 18, 27, 45, 66, 99, 101 };
        int[] vetor_B = { 2, 3, 5, 16, 19, 44, 46, 78, 100, 102 };
        int[] vetor_C = vetor_A;
        int[] vetor_Capia;

        int idx_B = 0;
        boolean igual = false;

        while (true) {

            if (idx_B >= vetor_B.length) {
                break;
            }
            int contPassagem = 0;
            vetor_Capia = vetor_C;

            for (int idx_C = 0; idx_C < vetor_C.length; idx_C++) {
                if (vetor_C[idx_C] == vetor_B[idx_B]) {
                    idx_B++;
                    igual = true;
                    break;
                } else {
                    contPassagem++;
                    igual = false;
                }
            }
            if (!igual) {

                vetor_C = new int[vetor_Capia.length + 1];
                for (int i = 0; i < vetor_C.length - 1; i++) {
                    vetor_C[i] = vetor_Capia[i];
                }
                if (contPassagem == vetor_C.length - 1) {
                    vetor_C[vetor_C.length - 1] = vetor_B[idx_B];
                    idx_B++;
                }
            }

        }

        for (int i = 0; i < vetor_C.length; i++) {
            System.out.print(vetor_C[i] + " ");
        }

    }
}
