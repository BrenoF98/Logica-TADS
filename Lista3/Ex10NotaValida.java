import java.util.Scanner;

public class Ex10NotaValida {
    /*
     * 10. Nota válida
     * Leia uma nota de 0 a 10.
     * 
     * Enquanto a nota estiver fora do intervalo permitido, solicite uma nova nota.
     * Quando uma nota válida for informada, classifique-a como:
     * 
     * APROVADO, se nota maior ou igual a 6;
     * REPROVADO, caso contrário.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a nota: (0 a 10)");
        int nota = entrada.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Erro! Informe uma nota valida.");
            nota = entrada.nextInt();
        }

        if (nota >= 6) {
            System.out.println("APROVADO!");
        }else {
            System.out.println("REPROVADO!");
        }

        entrada.close();
    }
}
