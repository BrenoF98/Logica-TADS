import java.util.Scanner;

public class Ex22CaixaDeSuperMercado {

    /*
     * 22. Caixa de supermercado
     * Leia o valor de cada produto de uma compra. O valor 0 indica que não há mais
     * produtos.
     * 
     * Valores negativos são inválidos e devem ser ignorados.
     * 
     * Ao final, apresente:
     * 
     * quantidade de produtos comprados;
     * valor total da compra;
     * produto de maior valor;
     * quantidade de produtos com preço acima de R$ 100,00.
     * 
     * 
     * Se o total da compra for maior ou igual a R$ 500, aplique 5% de desconto e
     * apresente também o valor final com desconto.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contadorQuantProdut = 0, contadorMaior100 = 0;

        float valorProduto = -1, valorFinal, maior = 0, menor = 0, valorTotal = 0;

        while (valorProduto != 0) {
            System.out.print("Informe o valor do produto: ");
            valorProduto = entrada.nextFloat();
            if (valorProduto > 0) {
                contadorQuantProdut++;

                if (contadorQuantProdut == 1) {
                    maior = valorProduto;
                    menor = valorProduto;
                }
                valorTotal += valorProduto;

                if (valorProduto > maior) {
                    maior = valorProduto;
                }
                if (valorProduto < menor) {
                    menor = valorProduto;
                }
                if (valorProduto > 100) {
                    contadorMaior100++;
                }

            }
            
        }
        System.out.println("\nQuantidade de produtos: " + contadorQuantProdut);
        System.out.println("Valor total da compra: " + valorTotal);
        if (valorTotal >= 500) {
            valorFinal = valorTotal - (valorTotal * .05f);
            System.out.println("Valor final com desconto: " + valorFinal);

        } else {
            valorFinal = valorTotal;
            System.out.println("Valor final: " + valorFinal);
        }
        System.out.println("Produto de maior valor: " + maior);
        System.out.println("Produto de menor valor: " + menor);
        System.err.println("\nQuantidade de produtos com valor maior que 100: " + contadorMaior100 + "\n");
        
        entrada.close();
    }

}
