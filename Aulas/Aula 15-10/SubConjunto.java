import java.util.Scanner;

public class SubConjunto {
    public static void main(String[] args) {

        // dados dois vetores v1 e v2, verificar se v1 é subconjunto de v2
        Scanner scanner = new Scanner(System.in);

        int[] v1 = new int[5]; // tamanho arbitrario. Porém deve ser menor que o conjunto cujo será comparado
                               // para que posso existir a condição de v1 subconjunto de v2.
        int[] v2 = { 1, 2, 3, 4, 5, 6, 7, 8 }; // junto de comparação.

        int contIguais = 0;

        for (int i = 0; i < v1.length; i++) { // lé e armazena os valores para o conjunto v1
            System.out.println("Informe os elemetos de v2;");
            v1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < v2.length; i++) {
            boolean iguais = false;
            for (int j = 0; j < v1.length; j++) {
                if (v2[i] == v1[j]) {
                    //System.out.printf("\n%d = %d", v2[i], v1[j]);
                    contIguais++;
                    iguais = true;
                    break;

                }
            }
            if (i < v1.length && !iguais) {
                
                System.out.printf("\n%d não percente v1", v1[i]);
            }
        }


        if (contIguais == v1.length) {
            System.out.println("\nv1 é subconjunto de v2!");
        }

        scanner.close();

    }
}