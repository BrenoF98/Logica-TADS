import java.util.Scanner;

public class Ex16CupomPorFaixa {

    /*
     * 15. Classificação de nota
     * Leia uma nota de 0 a 10 e classifique:
     * 
     * >= 9: Excelente;
     * >= 7: Bom;
     * >= 6: Suficiente;
     * < 6: Insuficiente.
     * Se a nota estiver fora do intervalo de 0 a 10, mostre uma mensagem de erro.
     */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float valorDaCompra = entrada.nextFloat(), valorDesconto;

        if (valorDaCompra > 100) {
            if (valorDaCompra <= 299.99) {
                valorDesconto = valorDaCompra - (float) (valorDaCompra * .05);

            }
        } else {
            System.out.println("Não há desconto aplicavel o valor da compre é: " + valorDaCompra);
        }

    }
}
