import java.util.Scanner;

public class Ex22FretePorRegiãoEValorDaCompra {

    /*
     * 22. Frete por região e valor da compra
     * 
     * Leia o valor da compra e a região de entrega:
     * 
     * "S" — Sul;
     * "SE" — Sudeste;
     * "CO" — Centro-Oeste.
     * 
     * Fretes:
     * 
     * Sul: R$ 20;
     * Sudeste: R$ 30;
     * Centro-Oeste: R$ 40.
     * 
     * Se a compra for igual ou superior a R$ 500, o frete será grátis,
     * independentemente da região. Caso a região seja inválida, informe erro.
     * Mostre o valor da compra, frete e total final.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float valorDaCompra, frete = 0, total = 0;

        String regiao;

        System.out.println("Informe o valor da compra: ");

        valorDaCompra = entrada.nextFloat();

        System.out.println("Informe a região ( S — Sul | SE — Sudeste | CO — Centro-Oeste)");

        regiao = entrada.next();

        if (valorDaCompra < 500) {

            if (regiao.equalsIgnoreCase("S")) {

                frete = 20;
                total = valorDaCompra + frete;

            } else if (regiao.equalsIgnoreCase("SE")) {

                frete = 30;
                total = valorDaCompra + frete;

            } else if (regiao.equalsIgnoreCase("CO")) {
                frete = 40;
                total = valorDaCompra + frete;

            } else {
                System.out.println("ERRO!");
            }

        } else {
            System.out.println("O frete é gratuito!");
            total = valorDaCompra + frete;

        }

        System.out.println("Valor da compra: " + valorDaCompra);
        System.out.println("frete: " + frete);
        System.out.println("Total: " + total);

        entrada.close();
    }
}