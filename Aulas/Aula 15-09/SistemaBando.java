import java.util.Scanner;

public class SistemaBando {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;
        float saldo = 0, deposito = 0, saque = 0;

        System.out.println("Informe o saldo inicial");
        saldo = sc.nextFloat();

        boolean start = true;

        while (start) {

            System.out.print("""

                    1 - Ver saldo
                    2 - depositar
                    3 - sacar
                    4 - sair

                        """);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.printf("Saldo: %.2f\n", saldo);

            } else if (opcao == 2) {
                System.out.print("Informe o valor a ser depositado: ");
                deposito = sc.nextFloat();
                if (deposito >= 0) {

                    saldo += deposito;

                    System.out.printf("\nSaldo: %.2f\n", saldo);
                } else {
                    System.out.println("ERRO!\nValor invalido.\n");
                }

            } else if (opcao == 3) {
                System.out.print("Informe o valor a ser sacado: ");
                saque = sc.nextFloat();

                if (saque <= saldo && saque > 0) {

                    saldo -= saque;

                    System.out.printf("\nValor sacado: %.2f\n", saque);
                    System.out.printf("\nSaldo: %.2f\n", saldo);
                } else if (saldo <= 0) {
                    System.out.printf("Não é um valor valido\n");
                    
                }{
                    System.out.printf("Não é possivel sacar %.2f, o saldo em conta é %.2f\n", saque, saldo);
                }

            } else if (opcao == 4) {
                start = false;
            } else {
                System.out.println("ERRO\nInforme uma opção valida!");
            }
        }
    }
}
