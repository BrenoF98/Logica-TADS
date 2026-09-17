import java.util.Scanner;

public class Ex2InicioFimPasso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * 2. Intervalo com passo
         * Leia tres inteiros: inicio, fim e passo positivo. Apresente os valores do
         * intervalo, iniciando em inicio e aumentando pelo passo enquanto nao
         * ultrapassar fim. Valide o passo.
         */

        System.out.println("Informe tres números inteiros: (inicio, fim e passo positivo) ");
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int passo = sc.nextInt();

        boolean execute = true;

        while (execute) {

            if (passo > 0 && inicio <= fim) {
                System.out.printf("\n\nCaminho de %d até %d com passo %d\n\n", inicio, fim, passo);
                for (int i = inicio; i <= fim; i += passo) {
                    System.out.println(i);
                }
                System.out.println("\nFIM!\n");
                execute = false;
            } else if (passo <= 0){
                System.out.println("O valor deve ser positivo diferente de zero.");
                
            } else {
                System.out.println("O inicio deve ser menor que o fim.");
            }
            
            if (execute) {
                System.out.println("Informe tres números inteiros: (inicio, fim e passo positivo) ");
                inicio = sc.nextInt();
                fim = sc.nextInt();
                passo = sc.nextInt();
            }
        }
        sc.close();
    }
}
