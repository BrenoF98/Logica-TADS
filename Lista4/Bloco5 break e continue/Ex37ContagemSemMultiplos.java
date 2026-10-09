import java.util.Scanner;

public class Ex37ContagemSemMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limiete da contagem: ");
        int limite = scanner.nextInt();

        int soma = 0;

        System.out.printf("\nSoma agregada dos elementos de 1 até %d, exceto multiplos de 3 e 5:\n\n", limite);
        for (int i = 1; i <= limite; i++) {

            if (i % 3 == 0 || i % 5 == 0)
                continue;

            soma += i;
            System.out.printf("%d + %d = %d\n", soma - i, i, soma);

        }
        scanner.close();
    }
}
