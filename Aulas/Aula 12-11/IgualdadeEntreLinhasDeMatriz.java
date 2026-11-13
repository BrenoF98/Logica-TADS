import java.util.Scanner;

public class IgualdadeEntreLinhasDeMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // faça um programa que indique quais linhas de uma matriz são iguais

        int[][] m = {
                { 1, 0, 0, -1 },
                { 1, 0, 1, 0 },
                { -1, 0, 0, 1, 0, 1 },
                { 0, 1, 1 },
                { 1, 0, 0, -1 }
        };

        for (int linha1 = 0; linha1 < m.length; linha1++) {
            for (int linha2 = linha1 + 1; linha2 < m.length; linha2++) {
                int[] vetorLin1 = m[linha1];
                int[] vetorLin2 = m[linha2];

                if (vetorLin1.length != vetorLin2.length)
                    continue;
                System.out.println("São iguais foi comparar...");

                boolean iguais = true;
                for (int i = 0; i < vetorLin1.length; i++) {
                    if (vetorLin1[i] != vetorLin2[i])
                        iguais = false;
                }
                if (iguais) {
                    System.out.println("São iguais: ");
                    System.out.println("Linha " + linha1 + " e linha " + linha2);
                } else  { 
                    sys
                }
            }
        }

    }
}
