
import java.util.Scanner;

public class Ex6ProcessoSeletivoCorrigidoSugestoesIA {
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

        /* boolean aprovadoNotaTecnica = notaProva >= 7,
            aprovadoNotaEntrevista = notaEntrevista >= 6, aprovadoTempoExp = anosExp >= 2; */
            // essa escrita vi em uma solução de IA, me pareceu muito mais eficientes 
            // por mais que deixe o codigo menos gelivel.

        // escrita mais rapida mas melhora a legibilidade. 
        boolean aprovadoNotaTecnica = notaProva >= 7;
        boolean aprovadoNotaEntrevista = notaEntrevista >= 6;
        boolean aprovadoTempoExp = anosExp >= 2;

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
