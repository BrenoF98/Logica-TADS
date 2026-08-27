import java.util.Scanner;

public class Ex49AnaliseDeCredito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // entrada

        float rendaMensal, valorDesejadoParcela;

        int idade;

        String divida, condfinanceira = "";

        boolean creditoAprovado = false;

        System.out.println("Informe a renda mensal: ");
        rendaMensal = entrada.nextFloat();

        if (rendaMensal > 0) {
            System.out.println("Informe o valor desejado para a parcela: ");
            valorDesejadoParcela = entrada.nextFloat();

            if (valorDesejadoParcela > 0) {

                System.out.println("Informe a idade: ");
                idade = entrada.nextInt();

                if (idade > 0) {
                    System.out.println("Possui divida? (S ou N) ");
                    divida = entrada.next();

                    if (divida.equals("S") || divida.equals("N")) {

                        if (divida.equals("N")) {
                            if (valorDesejadoParcela <= (rendaMensal * 0.25f)) {

                                condfinanceira = "Adequada!";
                                creditoAprovado = true;

                            } else if (valorDesejadoParcela <= (rendaMensal * 0.35f)) {

                                condfinanceira = "Atenção!";
                                creditoAprovado = true;
                            } else {
                                condfinanceira = "Inadequada!";
                                creditoAprovado = false;
                            }

                            if (creditoAprovado) {
                                if (idade < 21) {

                                    condfinanceira = "Análise adicional necessária!";
                                    creditoAprovado = false;
                                }
                                if (idade >= 65 && valorDesejadoParcela >= (rendaMensal * 0.2f)) {

                                    condfinanceira = "inadequada!";
                                    creditoAprovado = false;

                                }
                            }

                            if (creditoAprovado) {

                                System.out.println("Condição financeira: " + condfinanceira);
                                System.out.println("Credito Aprovado!");

                            } else {
                                System.out.println("Condição financeira: " + condfinanceira);
                                System.out.println("Crédito Negado!");

                            }

                        } else {
                            System.out.println("Você possui dividas!");
                            System.out.println("Crédito Negado!");

                        }

                    } else {
                        System.err.println("ERRO! Resposta invalidade!");
                    }

                } else {

                    System.err.println("ERRO! Idade invalida!");
                }

            } else {

                System.err.println("ERRO! Valor da parcela invalido!");
            }

        } else {
            System.err.println("ERRO! Renda mensal invalida!");
        }

        entrada.close();

    }
}
