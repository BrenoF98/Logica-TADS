import java.util.Scanner;

public class Ex4PodeDividir {

    /* Pode dividir?
    
    Leia dois números reais. Antes de realizar a divisão do primeiro pelo segundo, verifique se o segundo número 
    é diferente de zero. Se for zero, apresente uma mensagem informando que a divisão não pode ser realizada.*/

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float numero1, numero2;
        float resultado;

        System.out.print("Digite dois números inteiros a serem divididos: ");

        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        if (numero2 == 0){
            
            System.out.println("NÃO É POSSIVEL RELAIZAR DIVIZÃO POR 0 (ZERO)!");
        }else {
            resultado = numero1 / numero2;
            System.out.println(numero1 + " / " + numero2 + " = " + resultado);
        }

        entrada.close();
        
    }
    
}
