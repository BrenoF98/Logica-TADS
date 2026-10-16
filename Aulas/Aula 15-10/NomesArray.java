import java.util.Scanner;

public class NomesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // leia 5 nomes de pessoas
        // qual foi o primeiro nome? segundo ou o N nome?

        String[] nome = new String[3];

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("\nInforme um nome: ");

            nome[i] = scanner.nextLine(); // nome recebe o valor lido pelo scanner na posição i.
        }

        System.out.println();

        /* for (int i = 0; i < nome.length; i++) {
            System.out.printf("Posição %d -> Nome: %s\n", i, nome[i]);
            System.out.print("O nome tem " + nome[i].length() + " caracteres.\n\n");
        } */

        do {
            System.out.print("Informe uma posição: ");
            int posicao = scanner.nextInt();

            if (posicao < 0 || posicao > nome.length - 1)
                break;

            System.out.printf("A posição %d guardo o nome: %s.\n\n", posicao, nome[posicao]);

        } while (true);

        boolean esta = false;

        do {

            System.out.print("\nInforme um nome para ser buscado: ");
            String nomeProcurado = scanner.nextLine();

            for (int i = 0; i < nome.length; i++) {
                if (nome[i].equals(nomeProcurado)) {
                    System.out.println("Posição: " + i + " -> Nome: " + nome[i]);
                    esta = true;
                }

            }
            if (!esta) {
                System.out.println("Não esta na lista!");
            }
        } while (!esta);

        scanner.close();
    }
}
