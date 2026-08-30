import java.util.Scanner;

public class Ex12ValorAteAcertarACondicao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroIntInformado = 0, tentativas = 0;

        while (numeroIntInformado <= 0 || numeroIntInformado % 2 != 0 || numeroIntInformado % 5 != 0) {
            tentativas++;
            System.out.println("Informe um numero inteiro: ");
            numeroIntInformado = entrada.nextInt();
            if (numeroIntInformado <= 0 || numeroIntInformado % 2 != 0 || numeroIntInformado % 5 != 0) {
                System.out.println("Tente novamente!\nO valor informado não atende uma ou mais condições.");
            } else {
                System.out.println("O número correto foi: " + numeroIntInformado);
                System.out.println("foram necessarias " + tentativas + " tentativas para o acerto!");

            }
            
        }
        entrada.close();
    }
}
