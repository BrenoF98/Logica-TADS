import java.util.Scanner;

public class Ex21NotaDentroDaFaixa {
    public static void main(String[] args) {
        /*
         * 21. Nota dentro da faixa
         * Leia uma nota entre 0 e 10. Enquanto a entrada for invalida, solicite
         * novamente usando do-while. Ao final, classifique a nota em insuficiente,
         * suficiente, boa ou excelente.
         */
        Scanner scanner = new Scanner(System.in);
        int nota;
        do {
            System.out.println("Informe uma nota de 0 a 10: ");
            nota = scanner.nextInt();
        } while (nota < 0 || nota > 10);

        if (nota < 7) {
            System.out.println("Insuficiente!");
        } else if (nota < 8) {
            System.out.println("Suficiente!");
        } else if (nota < 9) {
            System.out.println("Boa!");

        } else if (nota <= 10) {

            System.out.println("excelente!");
        }
        scanner.close();
    }
}
