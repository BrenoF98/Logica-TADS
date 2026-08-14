
import java.util.Scanner;

public class Cedulas {

    // dado um valo em relais calcule quantas notas de 100, 10 e 2 são necessarias para compor esse valor. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, quant100, quant10, quant2;

        System.out.println("Informe um valor inteiro em reais");
        valor = sc.nextInt();

        quant100 = valor / 100;
        quant10 = (valor % 100) /10;
        quant2 = (valor % 10) / 2;

        System.out.println("Valor: " + valor);
        System.out.println(quant100 + " x 100");
        System.out.println(quant10 + " x 10");
        System.out.println(quant2 + " x 2");

        sc.close();
    }
}
