import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioAtual, PercentualAjuste, valorAjustado, novoSalario; 
        
        System.out.print("Digite o salário atual: ");
        salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de ajuste: ");
        PercentualAjuste = scanner.nextDouble();

        valorAjustado = salarioAtual * (PercentualAjuste / 100);
        novoSalario = salarioAtual + valorAjustado; 

        System.out.println("Valor do ajuste: R$ " + valorAjustado);
        System.out.println("Novo salário: R$ " + novoSalario);

        scanner.close();
    }
}
