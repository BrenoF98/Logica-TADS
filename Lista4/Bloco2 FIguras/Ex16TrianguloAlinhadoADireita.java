import java.util.Scanner;

public class Ex16TrianguloAlinhadoADireita {
    public static void main(String[] args) {
        /*
         * 16. Triangulo alinhado a direita
         * Leia a altura n e desenhe um triangulo reto alinhado a direita, usando
         * espacos antes dos asteriscos.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura do triangulo: ");
        int altura = scanner.nextInt();

        // Aceita qualquer altura maior que 0
        if (altura > 0) {

            for (int i = 0; i < altura; i++) {

                for (int j = 0; j < altura - 1 - i; j++) { // imprime a quantidade correta de espaços, se altura 5, e
                                                           // linha 2 (linha = i - 1), 5 - 1 - (2 - 1) = imprime 3 espaços
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) { // imprime os asteriscos após os espaços. 
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
