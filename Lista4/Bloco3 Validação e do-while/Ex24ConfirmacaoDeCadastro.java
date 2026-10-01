import java.util.Scanner;

public class Ex24ConfirmacaoDeCadastro {
    public static void main(String[] args) {

        /*
         * 24. Confirmacao de cadastro
         * Solicite uma idade e uma confirmacao (S ou N) para cadastrar uma pessoa. O
         * programa deve repetir a pergunta usando do-while enquanto a idade for
         * invalida ou a confirmacao for diferente de S e N. Ao final, informe se o
         * cadastro foi confirmado.
         */

        Scanner scanner = new Scanner(System.in);
        int idade;
        String confirma;
        boolean confirmaBool = false;

        do {
            System.out.print("\nInforme a sua idade: ");
            idade = scanner.nextInt();

            if (idade >= 18 && idade <= 120) {

                System.out.printf("\nSua idade é %d anos? \nS -> Sim\nN -> Não \n\nResposta: ", idade);

                confirma = scanner.next().toUpperCase(); // como switch-case usa .equals para comparar string,
                                                         // precisamos tratar a entrada
                                                         // do user.
                switch (confirma) {
                    case "S":
                        confirmaBool = true;
                        break;

                    case "N":
                        confirmaBool = false;
                        break;

                    default:
                        System.out.println("Entrada INVALIDA!");
                        break;
                }
            }

        } while (idade < 18 || idade > 120 || !confirmaBool);

        if (confirmaBool) {
            System.out.println("\nCadostro Comfirmado!\n");
        }
        scanner.close();
    }
}
