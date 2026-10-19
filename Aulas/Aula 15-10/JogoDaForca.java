import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {

        // jogo da forca?

        Scanner scanner = new Scanner(System.in);

        System.out.print("Infomre o número de letras da palavra: ");
        int numChar = scanner.nextInt(); // le quantidade de letras de palabra.

        String[] forca = new String[numChar]; // inicia o vetor que receberá a palavra;

        String[] recebeForca = new String[numChar]; // inicia o vetor que receberá as letras do chute.

        String chute;

        int cont = 5;

        for (int i = 0; i < forca.length; i++) {
            System.out.println("Informe a palabra, sepando cada letra: ");
            forca[i] = scanner.next();
            recebeForca[i] = "_";
        }

        do {

            boolean acerto = false;

            System.out.print("Chute uma letra: ");
            chute = scanner.next();

            for (int j = 0; j < recebeForca.length; j++) {

                if (forca[j].equalsIgnoreCase(chute)) {
                    recebeForca[j] = chute;
                    acerto = true;
                }
            }

            if (!acerto) {
                cont--;
                System.out.println("Erro!");
            }

            if (cont == 0) {
                System.out.println("Enforcado!");
                break;
            }

            for (int k = 0; k < forca.length; k++) {
                System.out.printf("|%s", recebeForca[k]);
            }
            System.out.print("| \n");
            System.out.printf("\nRestam %d tentativas.\n", cont);

            if (chute.equalsIgnoreCase("sair"))
                break;

        } while (!chute.equalsIgnoreCase("sair") && cont > 0);

        scanner.close();

    }
}