import java.util.Scanner;

public class Lista02Ex19ValidacaoDeUsuarioESenha {
    public static void main(String[] args) {
        /*
         * Bloco 1 — Leitura Antecipada e Múltiplos Motivos de Falha
         * Lista 02 — Exercício 19: Validação de usuário e senha
         * Leia um nome de usuário e uma senha.
         * 
         * usuário correto: "admin";
         * senha correta: "java123". O programa deve informar separadamente se o usuário
         * está incorreto ou se a senha está incorreta. O acesso só deve ser permitido
         * quando os dois estiverem corretos.
         */

        // entrada

        Scanner entrada = new Scanner(System.in);

        String usuario = "", senha = "";

        // validação

        String usuarioDataBase = "admin", senhaDataBase = "java123";

        do {

            System.out.println("Informe seu usuario: ");
            usuario = entrada.next();
            System.out.println("Informe sua senha: ");
            senha = entrada.next();

            boolean acessoPermitido = senha.equalsIgnoreCase(senhaDataBase)
                    && usuario.equalsIgnoreCase(usuarioDataBase);

            if (acessoPermitido) {

                System.out.println("\nAcesso permitido!\n");

            } else {

                System.out.println("\nAcesso negado!\n");
            }

            if (!senha.equalsIgnoreCase(senhaDataBase)) {
                System.out.println("Senha incorreta");
            }
            if (!usuario.equalsIgnoreCase(usuarioDataBase)) {
                System.out.println("Usuario incorreto");

            }
        } while (!senha.equalsIgnoreCase(senhaDataBase) && !usuario.equalsIgnoreCase(usuarioDataBase));

        entrada.close();

    }
}
