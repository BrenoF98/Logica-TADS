import java.util.Scanner;

public class Ex19PiramideInvertida {
    public static void main(String[] args) {

        /*
         * 19. Piramide invertida
         * Leia uma altura impar n e desenhe uma piramide centralizada invertida,
         * iniciando pela maior quantidade de asteriscos.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe a altura n da piramide: ");
        int altura = scanner.nextInt();
        int base = altura * 2;

        for (int i = 0; i < altura; i++) {// enquanto i menos que a altura, devile linha.

            for (int j = 0; j < base; j++) { // j cresce até o valor da base.

                if (j <= i) { // adiciona espaços enquanto j menos igual que i
                    System.out.print(" ");
                } else if (j < base - (i)) { // adiciota asterisco enquanto j menor que a base (ex: 5), menos o contador
                                             // de linhas i. se linha 1 10 - 1 = 9 asteriscos impressos.

                    System.out.print("*");
                }
            }
            System.out.println("");// passa a linha.
        }

        scanner.close();
    }
}
