
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * 6. Caixa de operações
         * 
         * Crie um programa com saldo inicial zero e menu com switch:
         * 
         * entrada de valor,
         * retirada de valor,
         * consulta do saldo,
         * relatório e
         * sair.
         * 
         * O relatório deve apresentar:
         * quantidade de entradas,
         * quantidade de retiradas,
         * total movimentado e
         * saldo final.
         * 
         * Não permita retirada maior que o saldo.
         */

        float saldo = 0;
        float deposito, saque;
        float somaDeposito = 0, somaSaque = 0, totalMovimentado;
        int op, quantDeposito = 0, quantSaque = 0;

        do {
            System.out.printf("""

                    =========== MENU ===========

                    1 -> Deposito
                    2 -> Saque
                    3 -> Consulta de saldo
                    4 -> Extrato
                    0 -> SAIR

                    =========== ++++ ===========

                        """);

            op = sc.nextInt(); // solicita a opção. 

            switch (op) {
                case 1:

                    System.out.print("Informe o valor a ser depositado: "); 
                    deposito = sc.nextFloat(); // lê o valor do deposito. 

                    if (deposito > 0) { // permite apenas depositos maior que 0. 

                        quantDeposito++; // conta depositos validos.
                        somaDeposito += deposito; // soma os demositos validos.
                        saldo += deposito; // soma o deposito ao saldo existente.

                    } else { // retorna erro caso deposito menor que 0. 
                        System.out.println("Erro! Retornando ao menu.");
                    }
                    break; 

                case 2: 
                    System.out.print("Informe o valor a ser sacado: ");
                    saque = sc.nextFloat(); // lê o valor do saque. 

                    if (saque <= saldo && saque > 0) { // permite apenas saques maior que 0 e menor ou igual ao saldo. 

                        quantSaque++; // conta saques validos. 
                        somaSaque += saque; // soma os saques validos. 
                        saldo -= saque; // retida do saldo o valor sacado. 

                    } else { // retorna erro caso saque seja menor que 0 ou maior que o saldo. 
                        System.out.println("Erro! Retornando ao menu.");
                    }

                    break;
                case 3:

                    System.out.printf("\nO saldo em conta: %.2f\n\n", saldo); // mostra o saldo. 

                    break;
                case 4:
                    totalMovimentado = somaDeposito + somaSaque; // considerando o modulo dessas operações financeiras, calculando o valor total movimentado. 

                    // mostra o extrato. 
                    System.out.printf("""

                            ============== EXTRATO ===============

                            Quant. Deposito____________: %d un.
                            Quant. Saque_______________: %d un.
                            Total Movimentado__________: R$ %.2f
                            Saldo Atual________________: R4 %.2f

                            ============== XXXXXXX ===============

                                """, quantDeposito, quantSaque, totalMovimentado, saldo);
                    break;
                case 0: 
                    System.out.println("Saindo..."); // indica saída. 
                    break;
                default:
                    System.out.println("ERRO! Opção Invalida!"); // caso tenha sido atribuido a variavel "OP" um valor invalido, inda erro.  
                    break;
            }
        } while (op != 0);

        sc.close();
    }
}
