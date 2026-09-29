import java.util.Scanner;

public class Ex17TADinvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * 17. Triangulo invertido alinhado a direita
         * Leia a altura n e desenhe o triangulo anterior de forma invertida, iniciando
         * pela linha mais larga.
         * 
         */
        System.out.print("Informe a altura do triangulo: ");
        int altura = scanner.nextInt();

        // Aceita qualquer altura maior que 0
        if (altura > 0) {

            for (int i = 0; i < altura; i++) {

                for (int j = 0; j <= i - 1; j++) { // imprime os espaços começando em 0 até i-1 
                    System.out.print(" ");
                }
                for (int k = altura; k > i; k--) { // imprime os asteriscos após os espaços.
                    System.out.print("*");
                }
                System.out.println();
            }

        } else {
            System.out.println("Altura inválida! Informe um valor maior que zero.");
        }

        scanner.close();
    }
}