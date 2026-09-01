import java.util.Scanner;

public class Ex9SenhaComNumeroDeTentativas {

    /*
     * 9. Senha com número de tentativas
     * Solicite uma senha inteira. A senha correta é 2026.
     * 
     * O programa deve continuar solicitando a senha enquanto ela estiver incorreta.
     * 
     * Ao final, informe:
     * 
     * que o acesso foi permitido;
     * o número total de tentativas realizadas.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int senhaCorreta = 2026, senhaInformada, contador = 1;

        System.out.print("Informa a senha: ");
        senhaInformada = entrada.nextInt();

        while (senhaInformada != senhaCorreta) {
            contador++;
            System.out.print("Informa a senha: ");
            senhaInformada = entrada.nextInt();
        }

        System.out.println("\nSenha correta!\nAcesso permitido!\n");
        System.out.println("Foram necessarias " + contador + " tentativas para acessar!");

        entrada.close();
    }
}
