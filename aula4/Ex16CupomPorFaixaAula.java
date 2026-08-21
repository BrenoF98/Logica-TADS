import java.util.Scanner;

public class Ex16CupomPorFaixaAula {

    /*
        Leia o valor de uma compra e aplique:

abaixo de R$ 100,00: sem desconto;
de R$ 100,00 até R$ 299,99: 5%;
de R$ 300,00 até R$ 499,99: 10%;
R$ 500,00 ou mais: 15%.
Mostre o percentual aplicado, o valor do desconto e o valor final.


     */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escreva o valor da compra: ");

        float valorDaCompra = entrada.nextFloat(), valorDesconto, desconto, percentual;

        if (valorDaCompra < 100) {
            percentual = 0;
            }else if (valorDaCompra < 300) {
                percentual = 5;
                
            }else if (valorDaCompra < 500){
                percentual = 10;

            }else {
                percentual = 15;
            } 

        desconto = (float) (valorDaCompra * (percentual/100));
        valorDesconto = valorDaCompra - desconto;

        System.out.println("FOI APLICADO " +percentual+"% de desconto.");
        System.out.println("");
        System.out.println("O valor do desconto foi: " + desconto);
        System.out.println("O valor com desconto é: " + valorDesconto);
        entrada.close();
    }
}