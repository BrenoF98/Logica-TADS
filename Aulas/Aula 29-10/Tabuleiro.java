public class Tabuleiro {
    public static void main(String[] args) {
        String[] tabuleiro = { // vetor que repsetrana as posições
                /*
                 * 0 1 2
                 * 3 4 5
                 * 6 7 8
                 */
                "X", " ", " ",
                " ", "X", " ",
                " ", " ", "X"
        };
        for (int i = 0; i < tabuleiro.length; i++) {
                System.out.print(tabuleiro[i]);
                if ((i+1) % 3 != 0) {
                    System.out.print(" | ");
                }
                if ((i+1)%3 == 0 && i != tabuleiro.length-1) {
                    System.out.println("\n---------");
                } 
            }
    }
}
