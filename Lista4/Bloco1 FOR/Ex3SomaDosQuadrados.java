import java.util.Scanner;

public class Ex3SomaDosQuadrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor inteiro Positivo: ");
        long numeroN = sc.nextLong();

        long soma = 0;
        long anterior = 0;

        for (int i = 1; i <= numeroN; i++) {
            soma += i * i;
            System.out.printf("\n| Passo %04d | Soma em progresso... | %d + %d² = %d |", i , anterior, i, soma);
            anterior += soma;
        }

        System.out.printf("\nA soma dos quadrados de 1 até %d é %d", numeroN, soma);

        sc.close();
    }
}
