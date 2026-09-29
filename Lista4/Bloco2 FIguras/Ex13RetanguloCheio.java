import java.util.Scanner;

public class Ex13RetanguloCheio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura do retangulo: ");
        int altura = scanner.nextInt();
        System.out.print("Informe a largura do retangulo: ");
        int largura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        scanner.close();
    }
}
