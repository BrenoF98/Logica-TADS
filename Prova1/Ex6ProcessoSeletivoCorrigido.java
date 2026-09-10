
import java.util.Scanner;

public class Ex6ProcessoSeletivoCorrigido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int notaProva, notaEntrevista, anosExp;

        // leitura

        System.out.println("Informe a Nota na prova técnica: ");
        notaProva = entrada.nextInt();
        System.out.println("Informe a Nota da entrevista: ");
        notaEntrevista = entrada.nextInt();
        System.out.println("Informe os anos de experiencia: ");
        anosExp = entrada.nextInt();

        // processamento e validação. 

        boolean aprovadoNotaTecnica = false, aprovadoNotaEntrevista = false, aprovadoTempoExp = false;

        if (notaProva >= 7) {
            aprovadoNotaTecnica = true;
        }

        if (notaEntrevista >= 6) {
            aprovadoNotaEntrevista = true;
        }

        if (anosExp >= 2) {
            aprovadoTempoExp = true;
        }

        // Saida

        if (aprovadoNotaTecnica && aprovadoNotaEntrevista && aprovadoTempoExp) {
            System.out.println("Aprovado!");
        } else if (!aprovadoTempoExp && aprovadoNotaTecnica && aprovadoNotaEntrevista) {
            System.out.println("Cadastro Reserva!");
        } else {
            System.out.println("Reprovado!");
            if (!aprovadoNotaTecnica) {
                System.out.println("A nota da prova técnica não atingiu o minimo exigido");
            }
            if (!aprovadoNotaEntrevista) {
                System.out.println("A nota da entrevista não atingiu o minimo exigido");
            }
        }

        entrada.close();

    }
}
