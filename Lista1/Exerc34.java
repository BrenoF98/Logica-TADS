import java.util.Scanner;

public class Exerc34 {

    /* 34. Idade aproximada em dias
            Solicite ao usuário:

            a quantidade de anos completos;
            a quantidade de meses completos;
            a quantidade de dias adicionais.
            Calcule a idade aproximada da pessoa em dias.

            Considere:

            1 ano = 365 dias
            1 mês = 30 dias */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int anos, meses, dias, idadeDias;

        System.out.print("Informe a quantidade de anos completos: ");
        anos = scanner.nextInt();

        System.out.print("Informe a quantidade de meses completos: ");
        meses = scanner.nextInt();

        System.out.print("Informe a quantidade de dias adicionais: ");
        dias = scanner.nextInt();

        idadeDias = (anos*365) + (meses*30) + dias;

        System.out.println("A idade aproximada em dias é: " + idadeDias);

        scanner.close();

    }
}
