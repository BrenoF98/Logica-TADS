import java.util.Scanner;

public class Ex14TianguloRetoCrescente {
    public static void main(String[] args) {

        /*
         * 14. Triangulo reto crescente
         * Leia a altura n e desenhe um triangulo com uma estrela na primeira linha,
         * duas na segunda, ate n estrelas na ultima linha.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a altura do triangulo: ");
        int altura = scanner.nextInt();

        // Aceita qualquer altura maior que 0
        if (altura > 0) {

            for (int i = 0; i < altura; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

        } else {
            System.out.println("Altura inválida! Informe um valor maior que zero.");
        }
        scanner.close();
    }
}
