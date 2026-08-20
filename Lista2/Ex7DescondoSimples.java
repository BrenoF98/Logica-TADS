import java.util.Scanner;

public class Ex7DescondoSimples {

    /* 7. Desconto simples

Leia o valor de uma compra. 
Se o valor for maior ou igual a 200, aplique 10% de desconto. 
Caso contrário, mantenha o valor original. Mostre o valor final da compra. */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float valorCompra, valorCDesconto;

        System.out.println("Informe o valor da compra: ");
        valorCompra = entrada.nextFloat();

        if (valorCompra >= 200) {
            valorCDesconto = valorCompra - (float)(valorCompra * 0.1) ;
            System.out.println("O valor com desconto de 10% é: " + valorCDesconto);
        }else {System.err.println("O valor da compra não pertime desconto. \nO valor a ser pago é: " + valorCompra);}

        entrada.close();
    }
    
}
