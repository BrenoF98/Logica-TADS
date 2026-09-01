import java.util.Scanner;

public class Ex23EleicoesSimplificadas {
    /*
     * 23. Eleição simplificada
     * Em uma eleição existem três candidatos:
     * 
     * 1 — candidato A;
     * 2 — candidato B;
     * 3 — candidato C;
     * 0 — voto em branco.
     * Qualquer outro valor positivo deve ser considerado voto nulo. O valor -1
     * encerra a votação e não deve ser contabilizado.
     * 
     * Ao final, apresente:
     * 
     * votos de cada candidato;
     * votos em branco;
     * votos nulos;
     * total de eleitores que votaram;
     * candidato vencedor.
     * Considere que não haverá empate entre os candidatos.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int voto = -2, candidatoA = 0, candidatoB = 0, candidatoC = 0, branco = 0, nulos = 0, eleitores = -1;
        String vencedor;

        System.out.println("\n====== OPÇÕES DE VOTO ======");
        System.out.println(" [ 1 ] Candidato A");
        System.out.println(" [ 2 ] Candidato B");
        System.out.println(" [ 3 ] Candidato C");
        System.out.println(" [ 0 ] Voto em Branco");
        System.out.println("============================\n");

        while (voto != -1) {
            eleitores++;

            System.out.print("Informe seu voto: ");
            voto = entrada.nextInt();

            // votos negativos são ignorados. positivos diferente dos listados são nulos, 0
            // é branco. 1 2 e 3 são votos validos. o eleitor que coloca um voto negativo é
            // contato com eletor mas seu voto não é contabilizado em nenhuma das
            // apresentações solicitadas.
            
            if (voto == 1) {
                candidatoA++;
            } else if (voto == 2) {
                candidatoB++;
            } else if (voto == 3) {
                candidatoC++;
            } else if (voto == 0) {
                branco++;
            } else if (voto > 3) {
                nulos++;
            }

        }

        if (candidatoA >= candidatoB && candidatoA >= candidatoC) {
            vencedor = "Candidato A";
        } else if (candidatoB >= candidatoC) {
            vencedor = "Candidato B";
        } else {
            vencedor = "Candidato C";
        }

        System.out.println("\nvotos de cada candidato:\n");

        System.out.println("Candidato A: " + candidatoA);
        System.out.println("Candicato B: " + candidatoB);
        System.out.println("Candicato C: " + candidatoC);

        System.out.println("\nvotos em branco: " + branco);
        System.out.println("votos nulos: " + nulos);
        System.out.println("total de eleitores que votaram: " + eleitores);

        System.out.println("candidato vencedor: " + vencedor);

        entrada.close();
    }
}
