import java.util.Scanner;

public class Ex12QuadradoOco {
    public static void main(String[] args) {

        /*
         * 12. Quadrado oco
         * Leia o lado n e desenhe um quadrado oco. Imprima * na primeira e na ultima
         * linha e tambem na primeira e na ultima coluna; nos demais pontos, imprima
         * espaco.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o lado do quadrado: ");
        int lado = scanner.nextInt();

        for (int i = 0; i < lado; i++) {
            if (i == 0 || i == lado - 1) {

                for (int j = 0; j < lado; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int j = 0; j < lado; j++) {

                    if (j == 0 || j == lado-2) {
                        System.out.print("*");
                    }

                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
        scanner.close();
    }
}
