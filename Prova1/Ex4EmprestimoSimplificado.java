
import java.util.Scanner;

public class Ex4EmprestimoSimplificado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float salarioMensal, valorDoEmprestimo, valorParcela;

        int quantParcelar;

        boolean solicitParcela = false, solicitValorTotal = false;

        System.out.println("Informe: \n");

        System.out.println("Salario mensal: ");
        salarioMensal = entrada.nextFloat();

        System.out.println("Valor desejado: ");
        valorDoEmprestimo = entrada.nextFloat();
        System.out.println("Quantidade de parcelas: ");
        quantParcelar = entrada.nextInt();

        valorParcela = valorDoEmprestimo / quantParcelar;

        if (valorParcela <= (salarioMensal * 0.3f)) {

            System.out.println("Valor da parcela aprovado!");
            solicitParcela = true;

        } else {
            System.out.println("Valor da parcela negado!");

        }

        if (valorDoEmprestimo <= (salarioMensal * 10)) {
            System.out.println("Valor do emprestimo aprovado!");
            solicitValorTotal = true;
        } else {
            System.out.println("Valor do emprestimo negado!");

        }

        if (solicitParcela && solicitValorTotal) {
            System.out.println("Emprestimo Aprovado!");
        } else {
            System.out.println("Emprestimo Negado!");

        }

        entrada.close();
    }
}
