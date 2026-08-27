import java.util.Scanner;

public class Ex43LojacomDescontoFrete {

    /*
     * 43. Loja com desconto e frete
     * Leia:
     * 
     * valor da compra;
     * estado de destino ("RS", "SC" ou "PR");
     * se o cliente é premium ("S" ou "N").
     * Desconto:
     * 
     * cliente premium: 10%;
     * cliente comum com compra acima de R$ 500: 5%;
     * demais casos: sem desconto.
     * 
     * 
     * Frete:
     * 
     * RS: R$ 20;
     * SC: R$ 30;
     * PR: R$ 35.
     * 
     * Após aplicar o desconto, se o valor restante for igual ou superior a R$ 700,
     * o frete será grátis.
     * 
     * Mostre valor original, desconto, frete e total final.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float valorCompra, desconto = 0, frete = 0, valorComDesconto, valorFinal;

        String estado, premium;

        boolean siga = true;

        System.out.println("Informa o valor da compra: ");

        valorCompra = entrada.nextFloat();

        System.out.println("Você é um cliente PREMIUM? (S ou N) ");
        premium = entrada.next();

        if (premium.equalsIgnoreCase("S")) {
            desconto = valorCompra * .1f;

        } else if (premium.equalsIgnoreCase("N")) {
            if (valorCompra > 500) {

                desconto = valorCompra * .05f;
            }

        } else {
            System.out.println("ERRO! tipo de cliente invalido!");
            siga = false;
        }

        valorComDesconto = valorCompra - desconto;

        if (siga) {

            System.out.println("Informe o esta de destino: (RS, SC ou PR)");
            estado = entrada.next();
            if (!estado.equalsIgnoreCase("RS") && !estado.equalsIgnoreCase("SC") && !estado.equalsIgnoreCase("PR")) {
                System.out.println("ERRO! estado invalido!");
                siga = false;
            }
            if (siga) {

                if (valorComDesconto >= 700) {
                    frete = 0;
                    System.out.println("O valor com desconto é mairo que 700 reais! O frete é gratis!");
                } else {
                    if (estado.equalsIgnoreCase("RS")) {
                        frete = 20;
                    } else if (estado.equalsIgnoreCase("SC")) {
                        frete = 30;
                    } else {

                        frete = 35;
                    }
                }
            }
        }

        if (siga) {
            valorFinal = valorComDesconto + frete;
            System.out.println("Valor inicial da compra: " + valorCompra);
            System.out.println("Valor do desconto: " + desconto);
            System.out.println("Valor do frete: " + frete);
            System.out.println("Valor Final " + valorFinal);
        }
        entrada.close();
    }
}
