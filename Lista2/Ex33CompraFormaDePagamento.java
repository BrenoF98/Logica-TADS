
import java.util.Scanner;

public class Ex33CompraFormaDePagamento {
    /*33. Compra com forma de pagamento
Leia o valor da compra e a forma de pagamento:
"PIX";
"DINHEIRO";
"CARTAO".
Regras:

PIX: 10% de desconto;
dinheiro: 5% de desconto;
cartão: sem desconto.
Se o pagamento for em cartão e o valor for maior que R$ 1.000, acrescente uma taxa de 2%.

Mostre desconto, taxa e valor final. Formas de pagamento diferentes das três indicadas devem ser rejeitadas. */

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // entrada 
    float valor, taxa, valorDesconto = 0, valorfinal = 0, valortaxa = 0;
    String formaPagamento;

    System.out.println("Inform o valor e a forma de pagamento:");

    valor = entrada.nextFloat();
    formaPagamento = entrada.next();


    if (formaPagamento.equalsIgnoreCase("PIX")) {

        valorDesconto= valor*.1f;
        valorfinal = valor - valorDesconto;

    }else if (formaPagamento.equalsIgnoreCase("DINHEIRO")) {
        
        
        valorDesconto= valor*.05f;
        valorfinal = valor - valorDesconto;
        
    }else if (formaPagamento.equalsIgnoreCase("CARTAO")) {

        if (valor > 1000) {

        taxa = .02f;

        valortaxa = valor*taxa;
        valorfinal = valor + valortaxa;
    } else {
        valorDesconto = 0;
        valorfinal = valor - valorDesconto;
    }
    }else {
        System.out.println("Forma de pagamento INVALIDA!");
    }

    
    System.out.println("desconto: " + valorDesconto);
    System.out.println("taxa: " + valortaxa );
    System.out.println("Valor final " + valorfinal);



    entrada.close();
}
}
