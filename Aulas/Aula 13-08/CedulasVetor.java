import java.util.Scanner;

public class CedulasVetor {

    /* Um valor x, inteiro, em reais, será dado. A quantidade de cedulas de cada valor precisa ser defida
     para que o caixa eletronico consiga entregar adequadamente o valor*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cedulas = {100, 10, 2,};
        int[] quantidade = new int[cedulas.length];
        int valor;

        System.out.print("Digite o valor a ser sacado: ");
        valor = scanner.nextInt();

        for (int i = 0; i < cedulas.length; i++) {
            quantidade [i] = valor / cedulas[i];
            valor = valor % cedulas[i];
            System.out.println(quantidade[i] + " notas de " + cedulas[i]);
            
        }
        
        System.out.println("Sobrou: " + valor);
        
        scanner.close();
    }
    
}
