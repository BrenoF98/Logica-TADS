
import java.util.Scanner;
/*

Leia a quantidade de maçãs e o valor entregue pelo cliente.

Preço:

menos de 12 maçãs: R$ 1,50 por unidade;
12 ou mais: R$ 1,30 por unidade.
Calcule o total. Depois informe se o valor entregue é suficiente. 
Se for, calcule o troco; caso contrário, informe quanto ainda falta pagar. 
Quantidades e valores negativos são inválidos.*/

public class Ex25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int macas; 
        float valor, valorPagar, troco, faltou;

        System.out.print("Informe a quantidade de maças e depois o valor: ");

        macas = entrada.nextInt();
        valor = entrada.nextFloat();

        if (macas > 0 && valor > 0){
            if (macas < 12 && valor >= macas * 1.5) {
                valorPagar = (float) (macas * 1.5);
                System.out.println("O valor total a pargar por " + macas + " maçãs é " + valorPagar);

                if (valor > macas * 1.5) {

                    troco = (float)(valor - valorPagar);
                    System.out.println("O torco é: " + troco);

                } else {
                    System.out.println("Não há troco!");
                }

            }else if (macas >= 12  && valor >= macas * 1.3) {
                valorPagar = (float) (macas * 1.3);
                System.out.println("O valor total a pargar por " + macas + " maçãs é " + valorPagar);

                if (valor > macas * 1.3) {

                    troco = (float)(valor - valorPagar);
                    System.out.println("O torco é: " + troco);

                } else {
                    System.out.println("Não há troco!");

                }
            } else {
                System.out.println("O valor não é suficiente!");
                
                
                    if (macas < 12) {

                        faltou = (float) (macas * 1.5) - valor;
                        System.out.println("Para comprar " + macas + " maçãs é necessario mais " + faltou + " reais");
                        
                    }else {
                        faltou = (float) (macas * 1.3) - valor;
                        System.out.println("Para comprar " + macas + " maçãs é necessario mais " + faltou + " reais");

                    }
                }

                    
                
                }else {
                    
                    System.out.println("invalido!");
                }
    }
}


