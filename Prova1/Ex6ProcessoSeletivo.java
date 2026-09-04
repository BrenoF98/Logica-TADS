
import java.util.Scanner;

public class Ex6ProcessoSeletivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int notaProva, notaEntrevista, anosExp;

        System.out.println("Informe a Nota na prova técnica: ");
        notaProva = entrada.nextInt();

        if (notaProva >= 7) {
            System.out.println("Informe a Nota da entrevista: ");
            notaEntrevista = entrada.nextInt();


            if (notaEntrevista >= 6) {

                System.out.println("Informe os anos de experiencia: ");
                anosExp = entrada.nextInt();

                if (anosExp >= 2) {

                    System.out.println("Aprovado!");

                } else {
                    System.out.println("Cadastro reserva!");

                }

            } else {
                System.out.println("Reprovado! Nota na entrevista menor que 6");
            }

        } else {
            System.out.println("Reprovado! Nota na provateorica menor que 7");
        }

        entrada.close();

    }
}
