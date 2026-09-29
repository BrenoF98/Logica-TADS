import java.util.Scanner;

public class Ex15TrianguloRetoDecrescente {
    public static void main(String[] args) {

        /*
         * 15. Triangulo reto invertido
         * Leia a altura n e desenhe um triangulo iniciando com n estrelas e diminuindo
         * uma estrela a cada linha.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a altura do triangulo: ");
        int altura = scanner.nextInt();
        int linha = altura;
        // Aceita qualquer altura maior que 0
        if (altura > 0) {

            for (int i = 0; i < altura; i++) {
                linha--;
                for (int j = 0; j <= linha; j++) {
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
