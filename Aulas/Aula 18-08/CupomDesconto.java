import java.util.Scanner;

//codigo de avaliação

public class CupomDesconto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Float valorCompra;
        String cupomDesconto;

        System.out.println("Digite o valor da compra: ");
        valorCompra = entrada.nextFloat();
        System.out.println("Digite o cupom de desconto: ");
        cupomDesconto = entrada.next();

        if (cupomDesconto.equals("VALE10")) {

            if (valorCompra >= 30) {
                valorCompra = valorCompra - (valorCompra * 0.1f);
                System.out.println("Cupom de desconto aplicado! Novo valor da compra: " + valorCompra);
            } else {
                System.out.println("Cupom de desconto inválido! Nenhum desconto será aplicado.");
            }

        }else {
            System.out.println("Cupom de desconto inválido! Nenhum desconto será aplicado.");
        }

        entrada.close();
    }

}
