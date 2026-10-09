import java.util.Scanner;

public class Ex31MolduraRetangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Escreva um programa que leiam dois valores inteiros representando aquantidade
         * de linhas e colunas e desenha um quadrado oco
         */
        System.out.println("Informe a base e a altura do retanculo: ");

        int base = scanner.nextInt();
        int altura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        scanner.close();
    }
}
