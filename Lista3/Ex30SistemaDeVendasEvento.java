import java.util.Scanner;

public class Ex30SistemaDeVendasEvento {
    public static void main(String[] args) {

        /*
         * 30. Sistema de vendas de um evento

         * Um evento possui quantidade limitada de ingressos. Leia inicialmente:
         * 
         * quantidade total de ingressos disponíveis;
         * preço normal de cada ingresso.
         * Enquanto ainda houver ingressos disponíveis, o sistema deve receber uma nova
         * solicitação de compra contendo:
         * 
         * quantidade de ingressos desejada;
         * tipo de cliente ("NORMAL", "ESTUDANTE" ou "IDOSO").
         * 
         * Regras:
         * 
         * Quantidades menores ou iguais a zero são inválidas.
         * Não permita uma venda cuja quantidade solicitada seja maior que o estoque
         * restante.
         * Cliente NORMAL paga o valor integral.
         * Cliente ESTUDANTE recebe 50% de desconto.
         * Cliente IDOSO recebe 50% de desconto.
         * Tipos de cliente diferentes dos três previstos são inválidos e a venda não
         * deve ser realizada.
         * Depois de cada venda válida, atualize a quantidade de ingressos restantes.
         * O programa termina quando:
         * todos os ingressos forem vendidos; ou
         * o usuário informar 0 como quantidade desejada, indicando que deseja encerrar
         * as vendas antes do fim do estoque.
         * 
         * Ao final, informe:
         * 
         * quantidade de ingressos vendidos;
         * quantidade de ingressos restantes;
         * número de vendas realizadas;
         * quantidade de ingressos vendidos com meia-entrada;
         * valor total arrecadado;
         * maior valor registrado em uma única venda.
         * 
         */
        Scanner sc = new Scanner(System.in);

        // entrada 1

        float precoNormal;
        int quantIngresDisp;

        System.out.println("Informe a quantidade de ingressos disponiveis: ");
        quantIngresDisp = sc.nextInt();

        System.out.println("Informe o preço normal do ingresso: ");
        precoNormal = sc.nextFloat();

        for (int i = 0; i < 20; i++) { // separação entre entradas de database com entradas de cliente.
            System.out.print("=");
        }
        System.out.println();

        // Informações de compra

        int quantIngresSolic = 1;
        int tipoCliente = 0;

        // processamento

        float precoFinal = 0, desconto = 0, valorTotalArrecadado = 0, maiorValor1Venda = Float.MIN_VALUE;

        int quantIngresVentido = 0, quantVendasRealizadas = 0, quantVendMeia = 0;

        if (precoNormal > 0) {

            if (quantIngresDisp > 0) {

                while (quantIngresDisp > 0 && quantIngresSolic != 0) {
                    boolean clienteValido = false;

                    System.out.print("\nInforme a quantidade de ingressos que deseja comprar: ");
                    quantIngresSolic = sc.nextInt();
                    System.out.println("");

                    if (quantIngresDisp >= quantIngresSolic) {

                        while (!clienteValido && quantIngresSolic != 0) {

                            if (quantIngresSolic != 0) {

                                System.out.println("\n ++++++ Tipo de cliente ++++++ \n");

                                System.out.println("NOMRAL________-> 1");
                                System.out.println("ESTUDANTE_____-> 2");
                                System.out.println("IDOSO_________-> 3");

                                System.out.print("\nDigite o número referente a sua condição: ");

                                tipoCliente = sc.nextInt();

                                if (tipoCliente == 1) {
                                    desconto = 0;
                                    clienteValido = true;

                                } else if (tipoCliente == 2) {
                                    desconto = 0.5f;
                                    clienteValido = true;
                                } else if (tipoCliente == 3) {
                                    desconto = 0.5f;
                                    clienteValido = true;
                                } else {
                                    System.out.println("ERRO! Informe um tipo valido!");

                                }
                            }

                        }

                        if (clienteValido) {

                            quantIngresVentido += quantIngresSolic; // conta quantos ingressos foram vendidos.
                            quantIngresDisp -= quantIngresSolic; // atualiza os ingressos disponivies se a venda for
                                                                 // valida.
                            quantVendasRealizadas++; // conta quantas vendas foram realizados.

                            if (tipoCliente == 2 || tipoCliente == 3) {
                                quantVendMeia += quantIngresSolic;
                            }

                            precoFinal = quantIngresSolic * (precoNormal - (precoNormal * desconto));

                            valorTotalArrecadado += precoFinal;

                            if (precoFinal > maiorValor1Venda) {
                                maiorValor1Venda = precoFinal;
                            }

                            System.out.print("\nVenda realizada!\n");
                            System.out.printf("Preço da compra: %.2f\n", precoFinal);

                        }

                    } else {
                        System.out.printf(

                                "\nNão há ingressos suficientes para sua compra!\nNo momento há %d ingressos disponiveis\n",
                                quantIngresDisp);

                    }

                }

            } else {

                System.out.println("Quantidade invalida!");
            }
            System.out.println("\n================ RELATÓRIO FINAL ================\n");
            System.out.println("Quantidade de ingressos vendidos: " + quantIngresVentido);
            System.out.println("Quantidade de ingressos restantes: " + quantIngresDisp);
            System.out.println("Número de vendas realizadas: " + quantVendasRealizadas);
            System.out.println("Quantidade de ingressos vendidos com meia-entrada: " + quantVendMeia);
            System.out.printf("Valor total arrecadado: %.2f\n", valorTotalArrecadado);
            System.out.printf("Maior valor registrado em uma única venda: %.2f\n", maiorValor1Venda);
        } else {
            System.out.println("Valor invalido!");
        }

        sc.close();
    }
}
