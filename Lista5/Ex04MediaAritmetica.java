package Lista5;

import java.util.Scanner;

public class Ex04MediaAritmetica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float[] vetorValoresReais = new float[10];
        float somaVetorValoresReais = 0;
        float mediaVetorValoresReais = 0;

        for (int i = 0; i < vetorValoresReais.length; i++) {
            System.out.printf("Informe a nota do aluno %d: \n", i + 1);
            vetorValoresReais[i] = scanner.nextInt();
        }

        System.out.printf("Vetor Valores = {");
        for (int i = 0; i < vetorValoresReais.length; i++) {
            somaVetorValoresReais += vetorValoresReais[i];
            if (i != vetorValoresReais.length - 1) {
                System.out.printf("%.2f, ", vetorValoresReais[i]);
            } else {
                System.out.printf("%.2f", vetorValoresReais[i]);

            }
        }

        mediaVetorValoresReais = somaVetorValoresReais / vetorValoresReais.length;

        System.out.printf("}\n");

        System.out.println("Soma dos valores do vetor Valores Reais: " + somaVetorValoresReais);
        System.out.println("Média dos valores do vetor Valores Reais: " + mediaVetorValoresReais);

        scanner.close();
    }
}
