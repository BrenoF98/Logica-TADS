import java.util.Scanner;

public class Ex21EmprestimoSimplificado {

    /*
     * 21. Empréstimo simplificado
     * Leia:
     * 
     * salário mensal;
     * valor solicitado de empréstimo;
     * quantidade de parcelas.
     * 
     * Nenhum valor pode ser zero ou negativo. Se os dados forem válidos, calcule o
     * valor da parcela.
     * 
     * O empréstimo será aprovado somente se:
     * 
     * a parcela não ultrapassar 30% do salário;
     * o valor solicitado não ultrapassar 10 vezes o salário.
     * 
     * Informe o motivo da reprovação quando alguma condição não for atendida.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // entradas NÃO PODEM SER NEGATIVAS OU ZERO. se for positivo calular valor da
        // parcela.
        float salarioMensal, valorEmprestimoSolicitado, numeroParcelar;

        // saida

        float valorParcela;

        System.out.println("Salário mensal: ");
        salarioMensal = entrada.nextFloat();

        System.out.println("Valor do emprestimo solicitado: ");
        valorEmprestimoSolicitado = entrada.nextFloat();

        System.out.println("Número de parcelas: ");
        numeroParcelar = entrada.nextFloat();

        if (salarioMensal > 0 && valorEmprestimoSolicitado > 0 && numeroParcelar > 0) {
            valorParcela = valorEmprestimoSolicitado / numeroParcelar;
            if (valorParcela <= (salarioMensal * 0.3f)) {
                if (valorEmprestimoSolicitado <= (salarioMensal * 10)) {

                    System.out.println("Emprestimo aprovado!");
                    System.out.println("Valor da parcela: " + valorParcela);

                } else {
                    System.out.println("Emprestimo negado!");
                    System.out.println("O valor todal do emprestimo excede 10 salários!");
                }

            } else {
                System.out.println("Emprestimo negado!");
                System.out.println("Valor da parcela excede 30% do seu salário mensal! ");
            }

        } else {
            System.out.println("Um ou mais valores são invalidos!");
        }

        entrada.close();

    }
}
