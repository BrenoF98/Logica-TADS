import java.util.Scanner;

public class Ex27SenhaComLimite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * 27. Senha com limite
         * Solicite uma senha numerica usando do-while. A senha correta e 2468 e o
         * usuario possui no maximo cinco tentativas. Informe acesso permitido, bloqueio
         * ou quantidade de tentativas restantes.
         */
        int tentativas = 5;
        int senha = 2468;
        int senhaUser;

        do {
            System.out.print("\nInforme a senha: \n --> ");
            senhaUser = scanner.nextInt();

            tentativas--;

            if (senha == senhaUser) {
                System.out.println("Senha correta! Acessando...");
            } else if (tentativas == 0) {
                System.out.println("Não há mais tentativas!");
            } else {
                System.out.printf("Erro! Tente novamente. \nHá %d tentativas restantes...\n", tentativas);
            }

        } while (senha != senhaUser && tentativas != 0);
        scanner.close();
    }
}
