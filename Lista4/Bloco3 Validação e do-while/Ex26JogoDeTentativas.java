import java.util.Scanner;

public class Ex26JogoDeTentativas {
    public static void main(String[] args) {

        /*
         * 26. Jogo de tentativas
         * Defina o numero secreto como 37. Solicite palpites usando do-while ate o
         * usuario acertar ou informar -1 para desistir. Informe se o palpite e maior ou
         * menor, alem da quantidade de tentativas.
         */
        Scanner scanner = new Scanner(System.in);

        int numSecreto = 37;
        int palpite;
        int tentativas = 0;

        do {

            System.out.println("Informe seu palpite: (-1 Para Sair)");
            palpite = scanner.nextInt();

            if (palpite != -1) {
                tentativas++;

                if (palpite > numSecreto) {
                    System.out.println("Tente menor...");
                }
                if (palpite < numSecreto) {
                    System.out.println("Tente mais...");
                }
                if (palpite == numSecreto) {
                    System.out.println("ACERTOU!!");
                }
                System.out.printf("\nTentativa Nº: %04d\n\n", tentativas);

            } else {
                System.out.println("Saindo...");
            }

        } while (palpite != -1 && palpite != numSecreto);

        scanner.close();
    }
}
