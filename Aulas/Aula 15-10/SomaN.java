public class SomaN {
    public static void main(String[] args) {

        // verificar quais dois valores do vetor somados resultam em N.
        // Mostre a posição do valores.

        int[] v = { 27, 1, 6, 2, 8, 10, 21, 42, 4, 23 };
        int N = 27, soma, contSomas = 0;

        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                soma = v[i] + v[j];
                contSomas++;

                if (soma == N) {
                    System.out.printf("%d -> %d + %d = %d\n", contSomas, v[i], v[j], soma);
                    System.out.printf("Posição do Primeiro elemento: %d -> Valor: %d\n", i, v[i]);
                    System.out.printf("Posição do Segundo elemento: %d -> Valor: %d\n", j, v[j]);
                }
            }
        }

        int menor, maior;
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {

                System.out.printf("Comparado: %d Posi: %d | Comparando: %d Posi: %d\n", v[i], i, v[j], j);
                for (int k = 0; k < v.length; k++) {
                    System.out.printf("|%02d", v[k]);
                }
                System.out.print("| \n");
                for (int k = 0; k < v.length; k++) {
                    System.out.printf("|%02d", k);
                }
                System.out.print("| \n\n");
                if (v[i] > v[j]) {

                    menor = v[j];
                    maior = v[i];

                    v[i] = menor;
                    v[j] = maior;
                }

            }

        }
        for (int k = 0; k < v.length; k++) {
            System.out.printf("|%02d", v[k]);
        }
        System.out.print("| \n");
        for (int k = 0; k < v.length; k++) {
            System.out.printf("|%02d", k);
        }
        System.out.print("| \n\n");
    }
}
