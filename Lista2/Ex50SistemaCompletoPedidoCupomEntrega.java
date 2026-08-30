import java.util.Scanner;

public class Ex50SistemaCompletoPedidoCupomEntrega {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // variaveis de entrada
        float valorProduto, distanciaEntrega;
        String tipoCliente, cupomDesconto;

        // variaveis de processamento e saida
        float valorDescontoTipoCliente = 0, valorDescontoCupomAplicavel = 0, descontoTipoCiente = 0, descontoCupom = 0,
                valorfrete = 0, valorComDescontosAplicados = 0, valorFinal = 0;

        System.out.println("Informe o valor do produto: (reais)");
        valorProduto = entrada.nextFloat();

        // flag

        boolean segue = true;

        if (valorProduto > 0) { // certifica se valor do produto é adequado

            System.out.println("Informe a distancia da entrega: (km)");
            distanciaEntrega = entrada.nextFloat();

            if (distanciaEntrega >= 0) { // cerifica se distancia é adequada

                System.out.println("Informe tipo de cliente: (COMUM ou PREMIUM)");
                tipoCliente = entrada.next();

                if (!tipoCliente.equals("COMUM") && !tipoCliente.equals("PREMIUM")) { // se não for tipo certo erro

                    System.out.println("ERRO! Tipo de cliente invalido.");
                    segue = false;

                } else if (tipoCliente.equals("PREMIUM")) { // se tipo certo e PREMIUM aplica desconto de 5%

                    descontoTipoCiente = 0.05f;
                    valorDescontoTipoCliente = valorProduto * descontoTipoCiente;
                }
                if (segue) { // segue se tipo de cliente for adequado.

                    System.out.println("Informe o cupom de desconto: (SEM, DESC10 ou DESC20)");
                    cupomDesconto = entrada.next();

                    if (cupomDesconto.equals("DESC20") && valorProduto >= 300) { // analisa cupom

                        descontoCupom = 0.2f;

                        System.out.println("20% de desconto aplicado!");
                        valorDescontoCupomAplicavel = valorProduto * descontoCupom;

                        if (valorDescontoCupomAplicavel > 50) { // aplica limite de desconto

                            valorDescontoCupomAplicavel = 50;
                            System.out.println("Limte de 50 reais de desconto atingido. ");

                        }

                    } else if (cupomDesconto.equals("DESC10") && valorProduto >= 100) { // analisa cupom
                        descontoCupom = 0.1f;
                        System.out.println("10% de desconto aplicado!");
                        valorDescontoCupomAplicavel = valorProduto * descontoCupom;
                        if (valorDescontoCupomAplicavel > 20) {// aplica limite de desconto

                            valorDescontoCupomAplicavel = 20;
                            System.out.println("Limte de 20 reais de desconto atingido. ");

                        }

                    } else if (cupomDesconto.equals("SEM")) {
                        System.out.println("Sem cupom aplicavel.");
                        descontoCupom = 0;
                    } else { // se cupom não for valido, informa
                        System.out.println("ERRO! Cupom invalido!");
                        segue = false;
                    }

                    if (segue) {

                        // calcular valores com descontos aplicados

                        valorComDescontosAplicados = valorProduto - valorDescontoCupomAplicavel - valorDescontoTipoCliente;

                        // frete

                        if (tipoCliente.equals("PREMIUM") && valorComDescontosAplicados >= 150) {
                            valorfrete = 0;
                        } else if (tipoCliente.equals("COMUM") && valorComDescontosAplicados >= 300) {
                            valorfrete = 0;
                        } else {
                            if (distanciaEntrega > 15) {
                                valorfrete = 35;
                            } else if (distanciaEntrega > 5) {
                                valorfrete = 20;
                            } else {
                                valorfrete = 10;
                            }
                        }

                        // calcular valor com frete

                        valorFinal = valorComDescontosAplicados + valorfrete;

                        System.out.println("Valor original: " + valorProduto);
                        System.out.println("Desconto de cliente: " + valorDescontoTipoCliente);
                        System.out.println("Desconto do cupom: " + valorDescontoCupomAplicavel);
                        System.out.println("Valor do frete: " + valorfrete);
                        System.out.println("Valor final: " + valorFinal);

                    }
                }

            } else { // indica tipo de erro
                System.out.println("ERRO! Distancia invalida.");
            }

        } else { // indica tipo de erro
            System.out.println("ERRO! Valor do protudo invalido.");
        }
        entrada.close();
    }
}