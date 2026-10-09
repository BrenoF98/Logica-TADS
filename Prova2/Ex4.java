import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*
         * 4. Jogo de tentativas
         * Defina o número secreto como 37.* Solicite palpites usando do-while até o
         * usuário acertar ou informar -1 para desistir. Informe se o palpite é maior ou
         * menor, além da quantidade de tentativas.
         */
        Scanner sc = new Scanner(System.in);

        int valorSecreto = 37, tentativa;
        int quantTentativas = 0;

        do {
            System.out.print("Tente acertar o valor secreto: ");
            tentativa = sc.nextInt();

            if (tentativa == -1) { // finaliza. 
                System.out.println("Saindo.");
                break;
            }

            quantTentativas++;
            if (tentativa == valorSecreto) { //  caso tentativa correta 

                System.out.printf("\n\nPARABÉNS VOCÊ CONSEGUIU EM %d TENTATIVAS!!!\n\n", quantTentativas);

                break;

            } else if (tentativa > valorSecreto) { // tentativa maior que o valor secreto

                System.out.printf("Tentaitiva N° %d\n", quantTentativas);
                System.out.println("Tente menos...");

            } else if (tentativa < valorSecreto) { // tentativa menor que o valor secreto

                System.out.printf("Tentaitiva N° %d\n", quantTentativas);
                System.out.println("Tente mais...");


            }

        } while (tentativa != valorSecreto || tentativa != -1);

        sc.close();
    }
}
