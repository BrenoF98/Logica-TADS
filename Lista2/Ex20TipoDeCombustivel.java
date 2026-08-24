import java.util.Scanner;

public class Ex20TipoDeCombustivel {
    /*
     * 20. Tipo de combustível
     * Leia o tipo de combustível ("G" para gasolina ou "E" para etanol) e a
     * quantidade de litros abastecida.
     * 
     * Considere:
     * 
     * gasolina: R$ 6,20 por litro;
     * etanol: R$ 4,10 por litro.
     * Se forem abastecidos mais de 30 litros, conceda 5% de desconto.
     * Informe o tipo, o valor antes do desconto, o desconto e o valor final.
     * Caso o tipo informado seja inválido, mostre uma mensagem de erro.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // entradas
        String tipo;
        float quantidadeAbastecida = 0, precoLitro = 0, porcentragemDesconto = 0;
        // saidas
        float valorSemDesconto, valorDoDesconto, valorFinal;

        System.out.println("Informe o tipo de combustivel: (G -> Gasolina ou E -> Etanol)");
        tipo = entrada.nextLine();

        if (tipo.equalsIgnoreCase("G")) {
            tipo = "Gasolina";
            precoLitro = 6.2f;
            System.out.println("Quantidade em litros: ");
            quantidadeAbastecida = entrada.nextFloat();
            if (quantidadeAbastecida > 30) {
                porcentragemDesconto = .05f;
            } else {
                System.out.println("Não há desconto aplicavel! ");
            }

        } else if (tipo.equalsIgnoreCase("E")) {
            tipo = "Etanol";
            precoLitro = 4.1f;
            System.out.println("Quantidade em litros: ");
            quantidadeAbastecida = entrada.nextFloat();
            if (quantidadeAbastecida > 30) {
                porcentragemDesconto = .05f;
            } else {
                System.out.println("Não há desconto aplicavel! ");
            }

        } else {
            System.out.println("Tipo invalido!");
        }

        valorSemDesconto = quantidadeAbastecida * precoLitro;
        valorDoDesconto = valorSemDesconto * porcentragemDesconto;
        valorFinal = valorSemDesconto - valorDoDesconto;

        System.out.println("Tipo: " + tipo);
        System.out.println("Valor base: " + valorSemDesconto);
        System.out.println("Valor do desconto: " + valorDoDesconto);
        System.out.println("Valor final: " + valorFinal);
        entrada.close();
    }
}
