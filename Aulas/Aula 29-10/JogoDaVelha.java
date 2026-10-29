import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] tabuleiro = {
                " ", " ", " ",
                " ", " ", " ",
                " ", " ", " "
        };
        String jogada = "";
        int numJogadas = 0;
        int posicao = 0;
        do {
            numJogadas++;
            if (numJogadas % 2 != 0) {
                System.out.println("Vez do O: ");
                jogada = scanner.next();
                if (jogada.equalsIgnoreCase("p")) break;
                System.out.println("informe a posição de 1 a 9: ");
                posicao = scanner.nextInt();
                
            } else {
                System.out.println("Vez do X: ");
                jogada = scanner.next();
                if (jogada.equalsIgnoreCase("p")) break;
                System.out.println("informe a posição de 1 a 9: ");
                posicao = scanner.nextInt();
            }
        
            if (!tabuleiro[posicao - 1].equalsIgnoreCase(" ")) {
                System.out.println("Essa casa já foi marcada... tente outra");
                numJogadas--;
                continue;
            } else {
                tabuleiro[posicao - 1] = jogada;
            }
            for (int i = 0; i < tabuleiro.length; i++) {
                System.out.print(tabuleiro[i]);
                if ((i +1) % 3 != 0) {
                    System.out.println(" ");
                }
            }
        } while (true);

        scanner.close();

    }
}
