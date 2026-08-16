import java.util.Scanner;

public class Matz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3]; // Cria uma matriz 3x3

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) { // percorre cada coluna da linha atual, ou
                                                                            // seja, cada elemento da linha.

                System.out.print("Digite o valor para a posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt(); // lê o valor digitado pelo usuário e armazena na posição
                                                           // correspondente da matriz
            }

        }

        // Imprimindo a matriz
        System.out.println("Matriz 3x3:");

        for (int linha = 0; linha < matriz.length; linha++) { // percorre cada linha da matriz]

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) { // percorre cada coluna da linha atual, ou
                                                                            // seja, cada elemento da linha.

                System.out.print(matriz[linha][coluna] + " "); // imprime cada elemento da matriz seguido de um espaço

            }

            System.out.println(); // pula linha ao terminar cada linha da matriz

        }
        scanner.close(); // Fechar o scanner para liberar recursos
    }
}
